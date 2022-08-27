package com.codegym.shopping.controller;


import com.codegym.shopping.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @GetMapping("/shopping-cart")
    public ModelAndView showCart (@SessionAttribute(name = "cartDto", required = false) CartDto cart){
        System.out.println(cart);
        return new ModelAndView("cart","cart",cart);
    }
}
