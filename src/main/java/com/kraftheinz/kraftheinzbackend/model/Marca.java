package com.kraftheinz.kraftheinzbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="marca_sequence")
    @SequenceGenerator(name="marca_sequence", sequenceName = "mar_seq")
    @Column(name = "MARCA_ID")
    private Long codMarca;
    private String nome;

    @ManyToOne
    private Funcionario funcionarios;


    private Long codFuncionario;

    public Marca(String nome) {
        this.nome = nome;
    }

    public Marca() {
    }

    public long getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(long codMarca) {
        this.codMarca = codMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
