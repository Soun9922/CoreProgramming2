package FunctionalProgramming;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the roots of equation a*x*x + b*x + c :");
        double a = scr.nextInt();
        double b = scr.nextInt();
        double c = scr.nextInt();
        double root1, root2;
        double delta = b * b - 4 * a * c;
        double sqrt = Math.sqrt(delta);
        System.out.println("Value of delta : " + delta);
        if (delta > 0) {
            root1 = (-b + sqrt) / (2 * a);
            root2 = (-b - sqrt) / (2 * a);
            System.out.printf("The values of roots are :" + root1 + " " + root2);
            System.out.println("Roots are unequal");
        } else if (delta == 0) {
            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
            System.out.printf("The values of roots are :" + root1 + " " + root2);
            System.out.println("The roots are equal");
        } else
            System.out.println("The roots are imaginary");
    }
    }



