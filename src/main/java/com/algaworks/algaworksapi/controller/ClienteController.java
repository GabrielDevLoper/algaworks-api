package com.algaworks.algaworksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public String listar(){
        return "teste";
    }

}