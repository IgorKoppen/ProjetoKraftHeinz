package com.kraftheinz.kraftheinzbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="tag_sequence")
    @SequenceGenerator(name="tag_sequence", sequenceName = "tag_seq")
    @Column(name = "TAG_ID")
    private int codTag;

    private String nome;

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
}
