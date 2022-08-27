package com.codegym.shopping.controller;


import com.codegym.shopping.dto.CartDto;
import com.codegym.shopping.model.Product;
import com.codegym.shopping.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cartDto")
public class ProductController {
    @Autowired
    private IService service;

    @ModelAttribute("cartDto")
    public CartDto setUpCart(){
        return new CartDto();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products",service.findAll());
        return modelAndView;
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @SessionAttribute CartDto cartDto, @RequestParam("action") String action) {
        Optional<Product> productOptional = service.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cartDto.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        } else if(action.equals("list")){
            cartDto.addProduct(productOptional.get());
            return "redirect:/shop";
        }
        else  if (action.equals("sub")){
            cartDto.subProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        else {
            cartDto.addProduct(productOptional.get());
            return "redirect:/view/{id}";
        }
    }
    @GetMapping("/view/{id}")
    public ModelAndView viewProduct(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("products",service.findById(id).get());
        return modelAndView;
    }
}
