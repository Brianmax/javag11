package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(209);
        numeros.add(21);
        numeros.add(22);
        numeros.add(23);
        numeros.add(24);
        numeros.add(25);
        int length = numeros.size();

        int numero = numeros.get(0);
        System.out.println(numero);
        System.out.println(numeros);
        numeros.remove(5);
        System.out.println(numeros);

        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);
        lista.add(20);
        lista.add(21);
        lista.add(22);
        lista.add(23);
        System.out.println(lista);

        for (int item: numeros) {
            System.out.println(item);
        }
    }
}
