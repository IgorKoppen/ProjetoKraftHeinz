package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Produto;

import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.ProdutoRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    private ProdutoService(ProdutoRepository produtoRepository) { this.produtoRepository = produtoRepository;}
    public List<Produto> create(Produto produto, MultipartFile imagemFile) {
        try {
            produto.setImagemProduto(imagemFile.getBytes());
            produto.setTypeProduto(imagemFile.getOriginalFilename());
            produtoRepository.save(produto);
        } catch (IOException e){
            e.printStackTrace();
        }
        return list();
    }
    public List<Produto> list() { return produtoRepository.findAll();}
    public List<Produto> update(Produto produto) {
        produtoRepository.save(produto);
        return list();
    }
    public List<Produto> delete(Long cod) {
        produtoRepository.deleteById(cod);
        return list();
    }
}
