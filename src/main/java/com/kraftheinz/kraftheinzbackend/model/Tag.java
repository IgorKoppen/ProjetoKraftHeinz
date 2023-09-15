package com.kraftheinz.kraftheinzbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="tag_sequence")
    @SequenceGenerator(name="tag_sequence", sequenceName = "tag_sequence",initialValue=1, allocationSize=1)
    @Column(name = "TAG_ID")
    private int codTag;

    @Column(name="nome_tag")
    private String nome;

    @ManyToMany(mappedBy = "tagsFuncionario")
    @JsonIgnore
    Set<AvaliacaoFuncionario> avaliacaoFuncionario;

    @ManyToMany(mappedBy = "tagsCliente")
    @JsonIgnore
    Set<AvaliacaoCliente> avaliacaoCliente;

    public Tag(String nome) {
        this.nome = nome;
    }

    public Tag() {
    }

    public int getCodTag() {
        return codTag;
    }

    public void setCodTag(int codTag) {
        this.codTag = codTag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<AvaliacaoFuncionario> getAvaliacaoFuncionario() {
        return avaliacaoFuncionario;
    }

    public void setAvaliacaoFuncionario(Set<AvaliacaoFuncionario> avaliacaoFuncionarioSet) {
        this.avaliacaoFuncionario = avaliacaoFuncionarioSet;
    }

    public Set<AvaliacaoCliente> getAvaliacaoCliente() {
        return avaliacaoCliente;
    }

    public void setAvaliacaoCliente(Set<AvaliacaoCliente> avaliacaoClienteSet) {
        this.avaliacaoCliente = avaliacaoClienteSet;
    }
}
