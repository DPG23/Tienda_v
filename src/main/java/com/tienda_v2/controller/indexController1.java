package com.tienda_v2.controller;

import com.tienda_v2.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController1 {
    @Autowired
    ArticuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model, String cliente) {
         var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        return "index";
    }
}
