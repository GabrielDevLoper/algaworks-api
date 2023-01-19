package com.algaworks.algaworksapi.controller;

import com.algaworks.algaworksapi.entidades.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Jame");
        cliente1.setEmail("james@gmail.com");
        cliente1.setTelefone("82981029294");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("maria");
        cliente2.setEmail("maria@gmail.com");
        cliente2.setTelefone("8198165165");

        var cliente3 = new Cliente();
        cliente3.setId(4L);
        cliente3.setNome("sda");
        cliente3.setEmail("joao mario");
        cliente3.setTelefone("8198165165");

        return Arrays.asList(cliente1, cliente2, cliente3);
    }

}
