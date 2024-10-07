package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Persona {

    private String nombre;
    private Genero genero;

    void platosDeComida() {
        System.out.println("Se come un plato");
    }

    static void dormir() {
        System.out.println("5 horas de sueño");
    }
}
