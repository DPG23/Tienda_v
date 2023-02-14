package com.tienda_v2.controller;

import com.tienda_v2.domain.Cliente;
import com.tienda_v2.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model, String cliente) {
        String variable = "Hola desde el Back End";
        model.addAttribute("mensaje", variable);

       
        var clientes = clienteService.getClientes();
                
        model.addAttribute(cliente, clientes);

        return "index";
    }
 
}
