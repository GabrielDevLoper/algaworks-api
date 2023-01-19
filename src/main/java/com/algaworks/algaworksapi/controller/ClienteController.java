package com.algaworks.algaworksapi.controller;

import com.algaworks.algaworksapi.entidades.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("James");
        cliente1.setEmail("james@gmail.com");
        cliente1.setTelefone("82981029294");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("maria");
        cliente2.setEmail("maria@gmail.com");
        cliente2.setTelefone("8198165165");

        return Arrays.asList(cliente1, cliente2);
    }

}
