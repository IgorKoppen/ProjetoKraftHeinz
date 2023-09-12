package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Cliente;
import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public List<Cliente> create(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }
    public List<Cliente> list(){
        return clienteRepository.findAll();
    }
    public List<Cliente> update(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }
    public List<Cliente> delete(Long cod){
        clienteRepository.deleteById(cod);
        return list();
    }

}
