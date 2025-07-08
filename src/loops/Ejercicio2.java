package loops;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        numeros[0] = 10;
        System.out.println(numeros[0]);
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(0, 10); // 222
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Ingrese un valor");
        int valor = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("El valor existe en el array");
        } else {
            System.out.println("El valor no existe en el array");
        }

    }
}
