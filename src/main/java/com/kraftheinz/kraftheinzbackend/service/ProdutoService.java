package com.kraftheinz.kraftheinzbackend.service;

import com.kraftheinz.kraftheinzbackend.model.Marca;
import com.kraftheinz.kraftheinzbackend.model.Produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.kraftheinz.kraftheinzbackend.repository.ProdutoRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    private ProdutoService(ProdutoRepository produtoRepository) { this.produtoRepository = produtoRepository;}
    public List<Produto> create(Produto produto, MultipartFile imagemFile) throws IOException {
            produto.setImagemProduto(imagemFile.getBytes());
            produto.setTypeProduto(imagemFile.getName());
            produtoRepository.save(produto);
        return list();
    }
    public List<Produto> list() { return produtoRepository.findAll();}
    public List<Produto> update(Produto produto, MultipartFile imagemFile) throws IOException {
            produto.setImagemProduto(imagemFile.getBytes());
            produto.setTypeProduto(imagemFile.getName());
            produtoRepository.save(produto);
        return list();
    }
    public List<Produto> delete(Long cod) {
        produtoRepository.deleteById(cod);
        return list();
    }
    public Optional<Produto> findById(Long cod){
       return produtoRepository.findById(cod);
    }
    public Page<Produto> listaPaginada(PageRequest pr){return  produtoRepository.findAll(pr);}
}
