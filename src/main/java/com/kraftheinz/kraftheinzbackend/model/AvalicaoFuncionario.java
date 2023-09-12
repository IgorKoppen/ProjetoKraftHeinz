package com.kraftheinz.kraftheinzbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avaliacoesfuncionarios")
public class AvalicaoFuncionario extends Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="avaliacoes_funcionario_sequence")
    @SequenceGenerator(name="avaliacoes_funcionario_sequence", sequenceName = "avf_seq")
    @Column(name = "avaliacoes_funcionario_id")
    private Long codAvalicaoFuncionario;
    private String redeSocial;
    private String usuarioPostagem;


    public AvalicaoFuncionario(String mensagem, String redeSocial, String usuarioPostagem) {
        super(mensagem);
        this.redeSocial = redeSocial;
        this.usuarioPostagem = usuarioPostagem;
    }

    public AvalicaoFuncionario() {

    }

    public Long getCodAvalicaoFuncionario() {
        return codAvalicaoFuncionario;
    }

    public void setCodAvalicaoFuncionario(Long codAvalicaoFuncionario) {
        this.codAvalicaoFuncionario = codAvalicaoFuncionario;
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
}
