package br.com.lojavirtual.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "status_rastreio")
@SequenceGenerator(name = "seq_status_rastreio", sequenceName = "seq_status_rastreio", allocationSize = 1, initialValue = 1)
public class StatusRastreio {

    private static final long serialVersionUID = 5631592480401907801L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_status_rastreio")
    private Long id;

    private String centroDistribuicao;
    private String cidade;
    private String estado;
    private String status;

    @ManyToOne
    @JoinColumn(name = "venda_compra_loja_virtual_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virtual_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusRastreio that = (StatusRastreio) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
