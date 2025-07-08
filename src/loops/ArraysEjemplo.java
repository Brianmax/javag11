package loops;
import java.util.Random;

public class ArraysEjemplo {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        int[] numeros2 = {5,43,2,65,67,23};
        Random r = new Random();
        numeros[5] = 39;
        numeros[9] = 76;

        numeros2[3] = 86;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(0, 1000); // 222
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
    }
}

// llenar el arraylist de 100 elementos

// pedir al usuario un numero

// determinar si el numero existe en el arraylist
