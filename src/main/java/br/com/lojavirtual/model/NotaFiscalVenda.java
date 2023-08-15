package br.com.lojavirtual.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "nota_fiscal_venda")
@SequenceGenerator(name = "seq_nota_fiscal_venda", sequenceName = "seq_nota_fiscal_venda", allocationSize = 1, initialValue = 1)
public class NotaFiscalVenda {

    private static final long serialVersionUID = 5631592480401907801L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_venda")
    private Long id;
    private String serie;
    private String numero;
    private String tipo;

    @Column(columnDefinition = "text")
    private String xml;

    @Column(columnDefinition = "text")
    private String pdf;

    @OneToOne
    @JoinColumn(name = "venda_compra_loja_virtual_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virtual_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalVenda that = (NotaFiscalVenda) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
