package com.kraftheinz.kraftheinzbackend.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "AVALIACOESFUNCIONARIOS")
public class AvaliacaoFuncionario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator ="avaliacoes_funcionario_sequence")
    @SequenceGenerator(name="avaliacoes_funcionario_sequence", sequenceName = "avaliacoes_funcionario_sequence", initialValue=1, allocationSize=1)
    @Column(name = "AVALIACOES_FUNCIONARIO_ID")
    private Long codAvalicaoFuncionario;

    @Column(name = "mensagem_af")
    private String mensagem;
    @Column(name = "data_avaliacao_af")
    private Date dataAvalicao;
    @Column(name="rede_social")
    private String redeSocial;

    @Column(name = "usuario_postagem")
    private String usuarioPostagem;

    @ManyToMany
    @JoinTable(
            name = "AUX_AVALIACOES_FUNCIONARIOS",
            joinColumns = @JoinColumn(name = "AVALIACOES_FUNCIONARIO_ID"),
            inverseJoinColumns = @JoinColumn(name = "TAG_ID"))
    Set<Tag> tags;
    @ManyToOne
    @JoinColumn(name="funcionario_id", nullable=false)
    private Funcionario funcionarios;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable=false)
    private Produto produtos;

    @ManyToOne
    @JoinColumn(name="marca_id", nullable=false)
    private Marca marcas;

    public AvaliacaoFuncionario(Long codAvalicaoFuncionario, String mensagem, Date dataAvalicao, String redeSocial, String usuarioPostagem, Set<Tag> tags, Funcionario funcionarios, Produto produtos, Marca marcas) {
        this.codAvalicaoFuncionario = codAvalicaoFuncionario;
        this.mensagem = mensagem;
        this.dataAvalicao = new Date(new java.util.Date().getTime());
        this.redeSocial = redeSocial;
        this.usuarioPostagem = usuarioPostagem;
        this.tags = tags;
        this.funcionarios = funcionarios;
        this.produtos = produtos;
        this.marcas = marcas;
    }

    public AvaliacaoFuncionario() {

    }


    public Long getCodAvalicaoFuncionario() {
        return codAvalicaoFuncionario;
    }

    public void setCodAvalicaoFuncionario(Long codAvalicaoFuncionario) {
        this.codAvalicaoFuncionario = codAvalicaoFuncionario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataAvalicao() {
        return dataAvalicao;
    }

    public void setDataAvalicao(Date dataAvalicao) {
        this.dataAvalicao = dataAvalicao;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getUsuarioPostagem() {
        return usuarioPostagem;
    }

    public void setUsuarioPostagem(String usuarioPostagem) {
        this.usuarioPostagem = usuarioPostagem;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Marca getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca marcas) {
        this.marcas = marcas;
    }
}
