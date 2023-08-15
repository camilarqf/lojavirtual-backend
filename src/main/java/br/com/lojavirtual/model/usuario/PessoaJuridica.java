package br.com.lojavirtual.model.usuario;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "pessoa_fk"))
public class PessoaJuridica extends Pessoa {
    private static final long serialVersionUID = -7785687657626036542L;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String inscEstadual;

    private String inscMunicipal;

    @Column(nullable = false)
    private String nomeFantasia;

    @Column(nullable = false)
    private String razaoSocial;

    private String categoria;
}
