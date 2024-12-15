package br.pro.delfino.drogaria.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 7)
    private String placa;

    @Column(nullable = false, length = 25)
    private String modelo;

    @Column(nullable = false, length = 4)
    private String ano;
}
