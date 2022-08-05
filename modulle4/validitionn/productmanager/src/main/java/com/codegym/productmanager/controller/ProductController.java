package com.codegym.productmanager.controller;


import com.codegym.productmanager.model.Product;
import com.codegym.productmanager.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public ModelAndView listProduct() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("product", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/create-product")
    public ModelAndView FormInsert() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }
    @GetMapping("/edit-product/{id}")
    public ModelAndView formEdit(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("product",productService.findById(id));
        return modelAndView;
    }
    @GetMapping("/delete-product/{id}")
    public ModelAndView formDelete(@PathVariable Long id){
        Optional<Product> product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("p",product.get());
        return modelAndView;
    }
    
    @PostMapping("/edit-product")
    public ModelAndView edit(@ModelAttribute("product") Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @PostMapping("/create-product")
    public ModelAndView Insert(@ModelAttribute("product") Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }
    @PostMapping("/delete-product")
    public String delete(@ModelAttribute("product") Product products){
        productService.remove(products.getId());
        return "redirect:product";
    }

}
