package com.kraftheinz.kraftheinzbackend.repository;

import com.kraftheinz.kraftheinzbackend.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

    @Query("SELECT new map(t.nomeTag as tagName, count(af.mensagem) as count) FROM Tag t JOIN t.avaliacaoFuncionario af GROUP BY t.nomeTag")
    List<Map<String, Object>> countAvaliacoesFuncionariosByTagName();

    @Query("SELECT new map(t.nomeTag as tagName, count(ac.mensagem) as count) FROM Tag t JOIN t.avaliacaoCliente ac GROUP BY t.nomeTag")
    List<Map<String, Object>> countAvaliacoesClientesByTagName();


}
