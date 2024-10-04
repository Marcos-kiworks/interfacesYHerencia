package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public abstract class Bicicleta {
    
    private String marca;
    private int asientos;
    private int engranajes;
    private double velocidad;
    private String grosorNeumatico;

}


    

