package com.codegym.validate_form.controller;

import com.codegym.validate_form.dto.FormDto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("form", new FormDto());
        return modelAndView;
    }

    @PostMapping("/validation")
    public ModelAndView checkValid(@Validated @ModelAttribute("form") FormDto formDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/index");
        } else {
            return new ModelAndView("/result");
        }
    }
}
