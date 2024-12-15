package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dataP;

    @Column(nullable = false)
    private BigDecimal vlTotal;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente clienteFK;

    @ManyToOne
    private Colaborador colaboradorFK;

    @ManyToOne
    private Vendedor vendedorFK;

    @OneToMany(mappedBy = "produtoFK")
    private List<PedidosProduto> itens;
}


