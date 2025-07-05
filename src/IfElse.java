import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        // evaluar si es mayor o menor de edad

        if ( edad >= 18 ) {
            System.out.println("Persona mayor de edad");
        } else {
            System.out.println("Persona menor de edad");
        }
    }

    // ejercicio 1
    // pedir al usuario un numero entero y determinar si es par o impar
    // modulo   10/2 = 5 ==> 0  10%2 == 0
}
