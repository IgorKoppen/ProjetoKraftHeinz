package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Marca;
import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.MarcaRepository;

import java.util.List;

@Service
public class MarcaService {
private MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }
    public List<Marca> create(Marca marca){
        marcaRepository.save(marca);
        return list();
    }
    public List<Marca> list(){
       return marcaRepository.findAll();
    }
    public List<Marca> update(Marca marca){
        marcaRepository.save(marca);
        return list();
    }
    public List<Marca> delete(Long cod){
        marcaRepository.deleteById(cod);
        return list();
    }
}
