package com.codegym.controller;


import com.codegym.model.Customer;
import com.codegym.service.CustomerImpl;
import com.codegym.service.ICustomer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private ICustomer customerService = new CustomerImpl();
    @GetMapping("")
    public String index(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }
}
