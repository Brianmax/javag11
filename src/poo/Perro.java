package poo;

public class Perro {
    // atributos
    String raza;
    String nombre;
    int edad;
    String color;
    Perro(String raza, String nombre, int edad, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    // metodos
    // ladra
    // duerme
    // come
    // hola a alguien

    // datoRetorno nombreFuncion (parametros de entrada) {
          // cuerpo de la funcion
    //}
    void ladrar() {
        System.out.println("Ladrando...");
    }
    void dormir() {
        System.out.println("Durmiendo...");
    }
    void comer() {
        System.out.println("Comiendo...");
    }
    void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }
}
