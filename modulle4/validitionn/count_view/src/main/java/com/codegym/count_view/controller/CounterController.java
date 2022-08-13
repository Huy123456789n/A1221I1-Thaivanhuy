package com.codegym.count_view.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/counter")
@SessionAttributes("counter")
public class CounterController {


}
