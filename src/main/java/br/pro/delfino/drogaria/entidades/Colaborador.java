package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 11)
    private String telefone;

    @Column(length = 100)
    private String endreco;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Perfil perfilFK;
}
