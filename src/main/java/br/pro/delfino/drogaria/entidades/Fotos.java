package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fotos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String foto;

    @Column(nullable = false, length = 300)
    private String comentario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Visitas visitasFK;
}
