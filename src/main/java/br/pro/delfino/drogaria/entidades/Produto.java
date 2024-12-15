package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 2)
    private String unMedida;

    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Integer qtdAtula;

}
