package patterns;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = sc.nextInt();
        numberPyramid(n);
    }

    static void numberPyramid(int rows) {
        for(int i = rows; i >= 1; i--) {
            for(int j = rows; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        /*
        output:
            5
            44
            333
            2222
            11111
        */

        System.out.println("\n\n");

        for(int i = rows; i >= 1; i--) {
            for(int j = rows; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        output:
            5
            54
            543
            5432
            54321
        */

        System.out.println();

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /* 
        output:
            12345
            1234
            123
            12
            1
        */

        System.out.println();

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        /*
        output: 
            55555
            4444
            333
            22
            1
        */
    }
}
