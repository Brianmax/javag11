package poo;

public class Usuario {
    String nombre; //*
    String apellido; //*
    int edad;
    String sexo;
    String correo; //*
    // crear una clase Computadora
// memoria ram *
// almacenamiento *
// marca *
// color
// precio
// crear los constructoes necesarios para poder soportar la creacion de computadoras
    Usuario(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
    Usuario(String nombre, String apellido, int edad, String sexo, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.correo = correo;
    }
}
