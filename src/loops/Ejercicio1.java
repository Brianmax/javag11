package loops;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int n = sc.nextInt();
        while(n != 1) {
            System.out.println(n);
           if (n % 2 == 0) {
               n = n / 2;
           } else {
               n = n * 3 + 1;
           }
        }
    }
}
