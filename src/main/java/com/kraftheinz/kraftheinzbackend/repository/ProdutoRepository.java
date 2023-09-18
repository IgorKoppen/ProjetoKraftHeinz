package com.kraftheinz.kraftheinzbackend.repository;

import com.kraftheinz.kraftheinzbackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
