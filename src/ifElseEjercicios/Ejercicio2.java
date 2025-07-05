package ifElseEjercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();
        // 15 ==> 3 5


        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Multiplo de 3 y de 5");
        } else if (n % 5 == 0) {
            System.out.println("Multiplo de 5");
        } else if (n % 3 == 0) {
            System.out.println("Multiplo de 3");
        } else {
            System.out.println("No es multiplo de 3 ni de 5");
        }
    }
}
