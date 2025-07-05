package ifElseEjercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de asistencias totales");
        int asistenciasTotales = sc.nextInt();
        System.out.println("Ingrese el numero de asistencias del estudiante");
        int asistenciasDelEstudiante = sc.nextInt();
        // 25 / 50 = 0.2

        float porcentaje = (float)asistenciasDelEstudiante / asistenciasTotales * 100;
        System.out.println("El porcentaje es: " + porcentaje);
        if (porcentaje >= 75) {
            System.out.println("Asistencia suficiente");
        } else {
            System.out.println("Asistencia insuficiente");
        }
    }
}
