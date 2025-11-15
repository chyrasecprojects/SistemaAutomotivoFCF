package com.exemplo.veiculos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int quilometragem;
    private String status;

    @ManyToOne
    private Marca marca;
}
