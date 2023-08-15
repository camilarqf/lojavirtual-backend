package br.com.lojavirtual.model.usuario;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "pessoa_fk"))
public class PessoaFisica extends Pessoa {

    private static final long serialVersionUID = -6662798142733586160L;

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;


}
