package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myVar1", "Hello my spring boot camp class.");
        model.addAttribute("myVar2", "Hello world!");
        return "hometemplate";

    }
    }

