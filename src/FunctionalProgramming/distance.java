package FunctionalProgramming;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the co-ordinates to calculate the line distance :");
        int disLine1 = scr.nextInt();
        int disLine2 = scr.nextInt();
        double dis = Math.sqrt(Math.pow(disLine1,2) + Math.pow(disLine2,2));
        System.out.println("The distance of the line is : "+dis);
    }
    }


