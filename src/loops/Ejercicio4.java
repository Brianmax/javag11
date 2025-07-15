package loops;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n = 12;
        isPrime(n);

        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }
        if (divisores > 2) {
            System.out.println("No es primo");
        } else {
            System.out.println("Si es primo");
        }
    }

    public static boolean isPrime(int n) {
        // implementacion
        return true;
    }
}
