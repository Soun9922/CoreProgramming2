package BasicCorePrograms;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int year;
        int base = 2, exponent;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        System.out.println("Enter Power value : ");
        exponent = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Its a leap year");
        else
            System.out.println("Its not a leap year");
        while (exponent <= 31) {
            for (int i = 0; i <= 2 * exponent; i++) {
                double result = Math.pow(base, exponent);
                System.out.println("The Power of 2 is : " + result);
            }
        }
    }
}
