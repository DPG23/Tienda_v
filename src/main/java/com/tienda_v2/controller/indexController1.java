package com.tienda_v2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController1 {

    @GetMapping("/")
    public String inicio(Model model, String cliente) {
                return "index";
    }
}
