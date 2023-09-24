package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.MarcaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
private MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }
    public List<Marca> create(Marca marca, MultipartFile imagemFile)  {
        try {
            marca.setImagemMarca(imagemFile.getBytes());
            marca.setTypeMarca(imagemFile.getName());
            marcaRepository.save(marca);
        } catch (IOException e){
            e.printStackTrace();
        }

        return list();
    }
    public List<Marca> list(){
       return marcaRepository.findAll();
    }

    public Page<Marca> listaPaginada(PageRequest pr){return  marcaRepository.findAll(pr);}
    public Optional<Marca> findById(Long cod){
        return marcaRepository.findById(cod);
    }

    public List<Marca> update(Marca marca,MultipartFile imagemFile){
        try {
            marca.setImagemMarca(imagemFile.getBytes());
            marca.setTypeMarca(imagemFile.getName());
            marcaRepository.save(marca);
        } catch (IOException e){
            e.printStackTrace();
        }
        return list();
    }
    public List<Marca> delete(Long cod){
        marcaRepository.deleteById(cod);
        return list();
    }
}
