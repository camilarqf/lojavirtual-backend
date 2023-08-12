package br.com.lojavirtual.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto {

    private static final long serialVersionUID = 5631592480401907801L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    private String tipoUnidade;

    @Column(columnDefinition = "text", length = 2000)
    private String descricao;
    private Double peso;
    private Double altura;
    private Double largura;
    private Double profundidade;
    private BigDecimal valorVenda = BigDecimal.ZERO;
    private Integer qtdeEstoque = 0;
    private Integer qtdeAlertaEstoque = 0;
    private String linkYoutube;
    private Boolean ativo = Boolean.TRUE;
    private Boolean alertaQtdeEstoque = Boolean.FALSE;
    private Integer qtdeClick = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto that = (Produto) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
