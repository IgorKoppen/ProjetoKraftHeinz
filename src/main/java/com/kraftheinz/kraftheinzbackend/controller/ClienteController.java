package com.kraftheinz.kraftheinzbackend.controller;

import com.kraftheinz.kraftheinzbackend.model.Cliente;
import org.springframework.web.bind.annotation.*;
import com.kraftheinz.kraftheinzbackend.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {this.clienteService = clienteService;}

    @PostMapping
    List<Cliente> create(@RequestBody Cliente cliente) {
        return clienteService.create(cliente);}

    @GetMapping
    List<Cliente> list(){
        return clienteService.list();
    }

    @PutMapping
    List<Cliente> update(@RequestBody Cliente cliente) {return clienteService.update(cliente);}

    @DeleteMapping
    List<Cliente> delete(Long cod){
        return clienteService.delete(cod);
    }
}