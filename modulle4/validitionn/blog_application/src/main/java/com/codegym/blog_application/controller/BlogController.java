package com.codegym.blog_application.controller;


import com.codegym.blog_application.model.BlogApp;
import com.codegym.blog_application.model.Category;
import com.codegym.blog_application.service.BlogServiceImpl;
import com.codegym.blog_application.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogServiceImpl blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/blog")
    public ModelAndView disPlay(@RequestParam("search") Optional<String> search,Pageable pageable){
        Page<BlogApp> blogApps ;
        if (search.isPresent()){
            blogApps = blogService.findAllByNameContaining(search.get(),pageable);
        } else{
            blogApps = blogService.findAll(pageable);
        }
//        Page<Category> categories = categoryService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blog",blogApps);
//        modelAndView.addObject("cate", categories );
        return modelAndView;
    }
    @GetMapping("create-blog")
    public ModelAndView formCreate(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog",new BlogApp());
        modelAndView.addObject("cate",categoryService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView formEdit(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("p",blogService.findById(id));

        return modelAndView;
    }
    @GetMapping("/delete-blog/{id}")
    public ModelAndView fromDelete(@PathVariable int id){
        Optional<BlogApp> music = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("blog/delete");
        modelAndView.addObject("p",music.get());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView create(@ModelAttribute("blog") BlogApp blogApp){
        blogService.save(blogApp);
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }
    @PostMapping("/delete-blog")
    public String delete(@ModelAttribute("blog") BlogApp blogApp){
        blogService.remove(blogApp.getId());
        return "redirect:blog";
    }

    @PostMapping("/edit-blog")
    public ModelAndView edit(@ModelAttribute("blog") BlogApp blogApp){
        blogService.save(blogApp);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("p",blogApp);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }
}
