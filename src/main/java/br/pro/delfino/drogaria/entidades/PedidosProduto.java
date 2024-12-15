






package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PedidosProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer qtd;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produtoFK;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pedidos pedidosFK;
}