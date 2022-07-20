package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping(value = "/calculator")
    public String Calculator(){
        return "home";
    }
    @PostMapping(value = "/calculator")
    public String Cal(@RequestParam int numberA, int numberB, String calculator, Model model){
        int result = 0;
        switch (calculator) {
            case "add":
                result = numberA + numberB;
                break;
            case "sub":
                result = numberA - numberB;
                break;
            case "mul":
                result = numberA * numberB;
                break;
            case "div":
                result = numberA / numberB;
                break;
        }
        model.addAttribute("result",result);
        return "home";
    }
}
