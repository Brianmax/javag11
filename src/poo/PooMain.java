package poo;

import java.math.BigInteger;

public class PooMain {
    public static void main(String[] args) {
//        Perro perro1 = new Perro("Pastor Aleman", "Chester", 1, "Dorado");
//        Perro perro2 = new Perro("Pastor Aleman", 2);

        Usuario usuario1 = new Usuario("George", "Maxi", "gmaxi@gmail.com");
        Usuario usuario2 = new Usuario("Jose", "Beltran", 29, "Masculino", "jbeltran@gmail.com");

        Calculadora calculadora1 = new Calculadora();
        System.out.println(calculadora1);
//
//        int resultado = calculadora1.suma(1, 45);
//        int resultado2 = calculadora1.suma(2, 45);
//        System.out.println(resultado);
//        System.out.println(resultado2);
//
//        // 5! = 5*4*3*2*1 = 120
//        int fact5 = calculadora1.factorial(5);
//        int fact10 = calculadora1.factorial(10);
        int fact15 = calculadora1.factorial(15);

        // crear un metodo para imprimir la tabla de multiplicar de cualquier numero
    }
}
// crear una clase Computadora
// memoria ram *
// almacenamiento *
// marca *
// color
// precio
// crear los constructoes necesarios para poder soportar la creacion de computadoras

// crear un objeto y completar todos los atributos y imprimirlos