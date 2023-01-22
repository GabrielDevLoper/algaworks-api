package com.algaworks.algaworksapi.api.controllers;

import com.algaworks.algaworksapi.domain.entities.Cliente;
import com.algaworks.algaworksapi.domain.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class ClienteController {

    @Autowired
    private  ClienteRepository clienteRepository;


    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return this.clienteRepository.findByNome("Teste");
    }

}
