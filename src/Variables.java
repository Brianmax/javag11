public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int edad = 1800;
        int edad2 = 30;
        System.out.println(edad);

        float estatura = 1.7f;
        double pi = 3.14159265358979;

        // modificando variables
        edad = 27;
        System.out.println(edad);
        edad = 27 + 1;
        System.out.println(edad);

        //edad = edad + edad2;
        edad += edad2;
        System.out.println(edad);
        // multiplicacion
        //edad = edad * edad2;
        edad *= edad2;

        // division
        float a = 9;
        int b = 20;
        // entero/entero ==> entero
        // float/float ==> float
        // float/ entero ==> float
        System.out.println(b/a); // 2

        final float PI = 3.14159265358979f;
        // PI = 323.232f; error no se pueden modificar

        char letra = 'A'; // solo comillas simples
        char numero = '8';
        String nombre = "George"; // comillas dobles

        // booleanos
        boolean isOk = true; // 1 bit // 1byte = 8 bits
        isOk = false;

        boolean isloaned = false;
        boolean isEmpty = true;

        // modulo

        System.out.println(10%2);
        System.out.println(23%3);
    }
}
