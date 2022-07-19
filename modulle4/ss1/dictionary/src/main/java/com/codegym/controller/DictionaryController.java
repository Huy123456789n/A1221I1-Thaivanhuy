package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String Trans(){
        return "index";
    }
    @PostMapping("/dictionary")
    public String Trans(@RequestParam String eng, Model model) {
        Map<String,String> dic = new HashMap<>();
        dic.put("hello","Xin Chào");
        dic.put("Bye","Tạm Biệt");
        model.addAttribute("eng",eng);
        model.addAttribute("res",dic.get(eng)!=null?dic.get(eng):"not found");
    return "index";
    }
}
