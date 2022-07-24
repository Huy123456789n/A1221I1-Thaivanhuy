package com.codegym.controller;


import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @GetMapping(value = ("/home"))
    public ModelAndView EmailSetting(Email email) {
     return new ModelAndView("home","email",email);
    }
    @PostMapping("/user")
    public ModelAndView user(@ModelAttribute("email") Email email)
    {
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("email", email);
        return modelAndView;
    }
}
