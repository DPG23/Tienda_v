package com.tienda_v2.controller;

import com.tienda_v2.domain.Cliente;
import com.tienda_v2.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/listado")
    public String inicio(Model model, String cliente) {
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        model.addAttribute("totalClientes", clientes.size());
        
        var totalCredito=0;
        for(var c:clientes){
            totalCredito+=c.getCredito().getLimite();
        }
        
        model.addAttribute("totalCredito", totalCredito);
        return "/cliente/listado";
    }

    @GetMapping("/eliminar/{idCliente}")
    public String eliminaCliente(Cliente cliente) {
        clienteService.deleteCliente(cliente);
        return "redirect:/cliente/listado";

    }

    @GetMapping("/nuevo")
    public String nuevoCliente(Cliente cliente) {
        return "/cliente/modifica";
    }

    @PostMapping("/guardar")
    public String guardaCliente(Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "redirect:/cliente/listado";

    }

    @GetMapping("/modificar/{idCliente}")
    public String modificaCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "cliente/modifica";

    }

}
