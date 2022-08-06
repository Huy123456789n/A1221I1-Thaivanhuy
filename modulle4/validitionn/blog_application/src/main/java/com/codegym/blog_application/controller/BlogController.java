package com.codegym.blog_application.controller;


import com.codegym.blog_application.model.BlogApp;
import com.codegym.blog_application.service.BlogServiceImpl;
import com.codegym.blog_application.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogServiceImpl blogService;

    @GetMapping("/blog")
    public ModelAndView disPlay(){
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blog",blogService.findAll());
        return modelAndView;
    }
    @GetMapping("create-blog")
    public ModelAndView formCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog",new BlogApp());
        return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView formEdit(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("music",blogService.findById(id));
        return modelAndView;
    }
    @GetMapping("/delete-blog/{id}")
    public ModelAndView fromDelete(@PathVariable int id){
        Optional<BlogApp> music = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("p",music.get());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView create(@ModelAttribute("blog") BlogApp blogApp){
        blogService.save(blogApp);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }
    @PostMapping("/delete-music")
    public String delete(@ModelAttribute("blog") BlogApp blogApp){
        blogService.remove(blogApp.getId());
        return "redirect:music";
    }

    @PostMapping("/edit-music")
    public ModelAndView edit(@ModelAttribute("blog") BlogApp blogApp){
        blogService.save(blogApp);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }
}
