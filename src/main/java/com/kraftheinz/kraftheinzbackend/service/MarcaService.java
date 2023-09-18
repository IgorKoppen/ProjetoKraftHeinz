package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;
import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.MarcaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class MarcaService {
private MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }
    public List<Marca> create(Marca marca, MultipartFile imagemFile)  {
        try {
            marca.setImagemMarca(imagemFile.getBytes());
            marca.setTypeMarca(imagemFile.getOriginalFilename());
            marcaRepository.save(marca);
        } catch (IOException e){
            e.printStackTrace();
        }

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
