package com.kraftheinz.kraftheinzbackend.model;

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

    @ManyToMany(mappedBy = "tags")
    Set<AvaliacaoFuncionario> avaliacaoFuncionarioSet;

    @ManyToMany(mappedBy = "tags")
    Set<AvaliacaoCliente> avaliacaoClienteSet;

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

    public Set<AvaliacaoFuncionario> getAvaliacaoFuncionarioSet() {
        return avaliacaoFuncionarioSet;
    }

    public void setAvaliacaoFuncionarioSet(Set<AvaliacaoFuncionario> avaliacaoFuncionarioSet) {
        this.avaliacaoFuncionarioSet = avaliacaoFuncionarioSet;
    }

    public Set<AvaliacaoCliente> getAvaliacaoClienteSet() {
        return avaliacaoClienteSet;
    }

    public void setAvaliacaoClienteSet(Set<AvaliacaoCliente> avaliacaoClienteSet) {
        this.avaliacaoClienteSet = avaliacaoClienteSet;
    }
}
