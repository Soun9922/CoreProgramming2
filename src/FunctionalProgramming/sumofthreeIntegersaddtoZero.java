package FunctionalProgramming;

import java.util.Scanner;

public class sumofthreeIntegersaddtoZero {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int numberOfElements = scr.nextInt();
        int arr[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter the elements : ");
            arr[i] = scr.nextInt();
        }
        for (int i = 0; i < numberOfElements - 2; i++) {
            for (int j = i + 1; j < numberOfElements - 1; j++) {
                for (int k = j + 1; k < numberOfElements; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}

