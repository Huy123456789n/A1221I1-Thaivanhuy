package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurencyController {
    @GetMapping("/trans")
    public String Trans(){
        return "index";
    }
    @PostMapping("/trans")
    public String Trans(@RequestParam String dollar, Model model) {
        double Vnd = 23000 * Double.parseDouble(dollar);
        model.addAttribute("dollar",dollar);
        model.addAttribute("Vnd",Vnd);
        return "index";
    }
}
