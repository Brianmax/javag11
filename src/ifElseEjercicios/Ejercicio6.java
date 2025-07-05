package ifElseEjercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota en matematica");
        int matematica = sc.nextInt();

        System.out.println("Ingrese la nota en fisica");
        int fisica = sc.nextInt();

        System.out.println("Ingrese la nota en quimica");
        int quimica = sc.nextInt();

        if ((matematica >= 65 && fisica >= 55 && quimica >= 50) || (matematica + fisica >= 140)) {
            System.out.println("Admitido");
        } else {
            System.out.println("No admitido");
        }
    }
}
