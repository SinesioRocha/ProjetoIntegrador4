package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 25)
    private String status;

    @Column(nullable = false)
    private LocalDateTime dtHora;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Agendamentos agendamentosFK;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente clienteFK;
}
