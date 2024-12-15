package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 36)
    private String categoria;

}

