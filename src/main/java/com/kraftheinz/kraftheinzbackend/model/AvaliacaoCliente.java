package com.kraftheinz.kraftheinzbackend.model;


import jakarta.persistence.*;

@Entity
@Table(name="AVALIACOESCLIENTES")
final public class AvaliacaoCliente extends Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="avalicaocliente_sequence")
    @SequenceGenerator(name="avalicaocliente_sequence", sequenceName = "avacli_seq")
    @Column(name = "AVALIACOES_CLIENTE_ID")
    private Long codAvaliacoesCliente;

    public AvaliacaoCliente(String mensagem) {
        super(mensagem);
    }

    public AvaliacaoCliente() {
    }

    public Long getCodAvaliacoesCliente() {
        return codAvaliacoesCliente;
    }

    public void setCodAvaliacoesCliente(Long codAvaliacoesCliente) {
        this.codAvaliacoesCliente = codAvaliacoesCliente;
    }
}
