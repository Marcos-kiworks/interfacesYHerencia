package com.example;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /* vamos a suponer la existencia de una fabrica
         * de bicicletas donde se emsamblan bicis de montaña,
         * carretera, electricas, etc
         */

         /* ¿Que es una interface? Conjunto de metodos relacionados que
          * pueden ser, en primer lugar, abstractos (no tiene cuerpo), static, default
          */

          /* Desde el punto de vista teorico un interface es un contrato
           * que se establece mediante el cual la clase que implemente dicha interface
            * se compromete a implementar todos los metodos de la interface aunque solamente
            * vaya a utilizar uno solo.
            * Cuanda la clase implemente los metodos de la interface, no puede violar/modificar
            * la firma del metodo 
            * ¿Que es la firma del metodo? 
            * Es el nombre del metodo, lo que recibe como parametro, 
            * sin incluir lo que devuelve.
            */
           
            /* ¿Qué es la herencia? 
             * La herencia es un mecanismo mediante el cual una clase o interfaz
             * hereda todos los miembros que sean public o protected
             * 
             * Los constructores NO se heredan
             */

             Estudiante estudiante1 = new Estudiante();

             estudiante1.setNombre("Rubén");
             estudiante1.setGenero(Genero.HOMBRE);

             System.out.println(estudiante1);

             System.out.println("Estudiante 2");

             
            Estudiante estudiante2 = Estudiante.builder()
                    .nombre("Iván")
                    .genero(Genero.HOMBRE)
                    .totalAsignaturas(10)
                    .build();
            System.out.println(estudiante2);


    }
}
