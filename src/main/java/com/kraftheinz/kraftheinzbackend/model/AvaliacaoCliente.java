package com.kraftheinz.kraftheinzbackend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="AVALIACOESCLIENTES")
final public class AvaliacaoCliente{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="avalicaocliente_sequence")
    @SequenceGenerator(name="avalicaocliente_sequence", sequenceName = "avalicaocliente_sequence",initialValue=1, allocationSize=1)
    @Column(name = "AVALIACOES_CLIENTE_ID")
    private Long codAvaliacoesCliente;
    @Column(name = "mensagem_ac")
    private String mensagem;
    @Column(name = "data_avaliacao_ac")
    private Date dataAvalicao = new Date(new java.util.Date().getTime());
    @ManyToMany
    @JoinTable(
            name = "AUX_AVALIACOES_CLIENTES",
            joinColumns = @JoinColumn(name = "AVALIACOES_CLIENTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "TAG_ID"))
    @JsonIgnore
    Set<Tag> tagsCliente;

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    @JsonBackReference(value = "clientes-avaliacoesclientes")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable=false)
    @JsonBackReference(value = "produtos-avaliacoesclientes")
    private Produto produtos;

    @ManyToOne
    @JoinColumn(name="marca_id", nullable=false)
    @JsonBackReference(value = "marcas-avaliacaoclientes")
    private Marca marcas;

    public AvaliacaoCliente(Long codAvaliacoesCliente, String mensagem, Date dataAvalicao, Set<Tag> tags, Cliente clientes, Produto produtos, Marca marcas) {
        this.codAvaliacoesCliente = codAvaliacoesCliente;
        this.mensagem = mensagem;
        this.dataAvalicao = new Date(new java.util.Date().getTime());
        this.tagsCliente = tags;
        this.clientes = clientes;
        this.produtos = produtos;
        this.marcas = marcas;
    }

    public AvaliacaoCliente() {
    }

    public Long getCodAvaliacoesCliente() {
        return codAvaliacoesCliente;
    }

    public void setCodAvaliacoesCliente(Long codAvaliacoesCliente) {
        this.codAvaliacoesCliente = codAvaliacoesCliente;
    }

    public Set<Tag> getTagsCliente() {
        return tagsCliente;
    }

    public void setTagsCliente(Set<Tag> tagClientSet) {
        this.tagsCliente = tagClientSet;
    }

    public Cliente getCliente() {
        return clientes;
    }

    public void setCliente(Cliente cliente) {
        this.clientes = cliente;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produto) {
        this.produtos = produto;
    }

    public Marca getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca marca) {
        this.marcas = marca;
    }
}
