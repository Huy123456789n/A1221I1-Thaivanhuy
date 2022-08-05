package com.codegym.controller;


import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductManager {
    private IProductService productService = new ProductServiceImpl();
    @GetMapping("")
    public String list(Model model){
        List<Product> products =productService.findAll();

        model.addAttribute("product",products);
        return "list";
    }

}
