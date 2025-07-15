package poo;

public class Calculadora {
    String marca;
    String modelo;
    // suma
    // int, int  --> procesando --> int

    // datoRetorno nombreFuncion (parametros de entrada) {
    // cuerpo de la funcion
    //}
    int suma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    int resta(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    // crear un metodo para imprimir la tabla de multiplicar de cualquier numero
}
