package loops;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[][] b = {{1,2,4}, {3,45,7}, {5,6,8}};
        int length = b.length;
        // 4 * 3 = 12 bytes
        // 12 * 3

        for (int i = 0; i < length; i++) { // i = 0
            // b[i] --> {1,2,4}
            for (int j = 0; j < b[i].length; j++){
                System.out.println(b[i][j]);
            }
        }
    }
}

// imprimir la tabla de multiplicar del 1 al 10

// 1 x 1 = 1
// 1 x 2 = 2
//   ....
// 1 x 10 = 10
// 2 x 1 = 2
// 2 x 2 = 4
//  ....
//  ....
// 10 x 1 = 10
// 10 x 2 = 20
//  ....
// 10 x 10 = 100
