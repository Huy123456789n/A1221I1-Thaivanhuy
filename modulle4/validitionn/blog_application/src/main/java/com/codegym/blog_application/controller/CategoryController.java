package com.codegym.blog_application.controller;


import com.codegym.blog_application.model.BlogApp;
import com.codegym.blog_application.model.Category;
import com.codegym.blog_application.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/api/category")
    public ResponseEntity<Iterable<Category>> findAllCate(){
        List<Category> categories = categoryService.findAllCate();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }


    @GetMapping("/create-category")
    public ModelAndView formCreate(){
        ModelAndView  modelAndView = new ModelAndView("/cate/create");
        modelAndView.addObject("cate",new Category());
        return modelAndView;
    }
    @GetMapping("/list-category")
    public ModelAndView display(@PageableDefault(value = 5) Pageable pageable){
        Page<Category> categories = categoryService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView(("/cate/list"));
        modelAndView.addObject("cate",categories);
        return modelAndView;
    }

    @GetMapping("/edit-category/{cate_id}")
    public ModelAndView formEdit(@PathVariable("cate_id") int id){
        ModelAndView modelAndView = new ModelAndView("/cate/edit");
        modelAndView.addObject("p",categoryService.findById(id));
        return modelAndView;
    }
    @GetMapping("/delete-category/{cate_id}")
    public ModelAndView fromDelete(@PathVariable("cate_id") int id){
        Optional<Category> category = categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/cate/delete");
        modelAndView.addObject("cate",category.get());
        return modelAndView;
    }

    @PostMapping("/delete-category")
    public String delete(@ModelAttribute("cate") Category category){
        categoryService.remove(category.getCate_id());
        return "redirect:/list-category";
    }

    @PostMapping("/edit-category")
    public ModelAndView edit(@ModelAttribute("cate") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/cate/edit");
        modelAndView.addObject("p",new Category());
        modelAndView.addObject("message","Complete");
        return modelAndView;
    }
    @PostMapping("/create-category")
    public ModelAndView create(@ModelAttribute("cate") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/cate/create");
        modelAndView.addObject("cate" ,new Category());
        modelAndView.addObject("message","Complete");
        return modelAndView;
    }
}
