public class OperadoresLogicos {
    public static void main(String[] args) {
        // > < >= <= == !=
        // respuesta booleana
        System.out.println( 1 > 5 ); // false
        System.out.println( 1 < 5 ); // true

        System.out.println( 10 >= 10); // true
        System.out.println( 10 > 10 ); // false

        boolean respuesta = 15 > 3;
        System.out.println("La respuesta es: " + respuesta);

        // ==

        System.out.println(10 == 10); // true
        System.out.println(10 == 12); // false

        // !=
        System.out.println(10 != 12); // true
        System.out.println(10 != 10); // false

        // and - or - not

        System.out.println( 15 > 4 && 10 > 4 ); // true
        //                     T        T
        System.out.println( 15 < 4 && 10 > 4 ); // false
        //                     F        T

        System.out.println( 15 > 4 || 10 > 4 ); // true
        //                     T        T
        System.out.println( 15 < 4 || 10 > 4 ); // true
        //                     F        T
        System.out.println( 15 == 4 || 10 == 4 ); // false
        //                     F         F
        System.out.println( !(15 == 4 || 10 == 4) ); // false, pero aplicando not se convierte en true
    }
}
