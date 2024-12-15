package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Agendamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dtAgen;

    @ManyToOne
    private Colaborador colaboradorFK;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente clienteFK;

    @ManyToOne
    private Vendedor vendedorFK;
}
