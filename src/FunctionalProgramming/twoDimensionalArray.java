package FunctionalProgramming;

import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int rows, cols, i, j;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the M rows : ");
        rows = scn.nextInt();
        System.out.println("Enter the N Columns : ");
        cols = scn.nextInt();
        int[][] arrayvalue = new int[rows][cols];
        System.out.println("Value of integer array element : ");
        for ( i = 0; i < arrayvalue.length; i++) {
            for ( j = 0; j < arrayvalue[0].length; j++) {
                arrayvalue[i][j] = scn.nextInt();
            }
        }
        for ( i = 0; i < arrayvalue.length; i++) {
            for ( j = 0; j < arrayvalue[0].length; j++) {
                System.out.print(arrayvalue[i][j] + " ");
            }
            System.out.println();
        }
    }
}

