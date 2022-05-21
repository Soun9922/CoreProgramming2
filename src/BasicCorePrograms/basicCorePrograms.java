package BasicCorePrograms;

import java.util.Scanner;

public class basicCorePrograms {
    public static void flipCoinSimulator() {
        int noOfFlips = 0;
        int Heads = 0;
        int Tails = 0;
        double randNum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coin tosses wanted : ");
        noOfFlips = input.nextInt();
        for (int i = 1; i <= noOfFlips; i++) {
            randNum = Math.random();
            System.out.println(i + " " + randNum);
            if (randNum < 0.5) {
                Heads++;
                System.out.println("Heads");
            } else {
                Tails++;
                System.out.println("Tails");
            }
        }
        System.out.println();
        System.out.println("Number of Heads : " + Heads);
        System.out.println("Number of Tails : " + Tails);

        double perHead = (double) Heads / noOfFlips * 100;
        double perTail = (double) Tails / noOfFlips * 100;

        System.out.println("Percentage of Heads : " + perHead);
        System.out.println("Percentage of Tails : " + perTail);
    }

    public static void leapYear() {
        int year;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Its a leap year");
        else
            System.out.println("Its not a leap year");
    }

    public static void powerof2() {
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

    public static void harmonicNumber() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the Harmonic Value N : ");
        double harnum = sc.nextDouble();
        while (harnum > 0) {
            sum += 1 / harnum;
            harnum--;
        }
        System.out.println(" " + sum);
    }

    public static void primeFactors() {
        System.out.println("Enter the number to find prime factors : ");
        Scanner scn = new Scanner(System.in);
        int primrFactors = scn.nextInt();
        for (int div = 2; div * div <= primrFactors; div++) {
            while (primrFactors % div == 0) {
                System.out.println(div + " ");
                primrFactors = primrFactors / div;
            }
        }
        if (primrFactors >= 2) {
            System.out.println(primrFactors);
        }
    }

    public static void quotientandRemainder() {
        Scanner quotient = new Scanner(System.in);
        System.out.println("Enter the number to find the quotient and Reminder : ");
        int q = quotient.nextInt();
        Scanner remainder = new Scanner(System.in);
        System.out.println("Enter the divisor : ");
        int r = remainder.nextInt();
        int q1 = q / r;
        int r1 = q % r;
        System.out.println("Quotient of " + q + " is : " + q1);
        System.out.println("Remainder of " + q + " is : " + r1);
    }

    public static void swapToNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number to swap : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before Swapping : " + num1 + " " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping : " + num1 + " " + num2);
    }

    public static void numberEvenandOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether the number is even or odd : ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }

    public static void vowelandConsonantCheck() {
        boolean isVow = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet to check whether it's Vowel or Consonant : ");
        char alpha = sc.next().charAt(0);
        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVow = true;
        }
        if (isVow == true) {
            System.out.println("The Alphabet " + alpha + " is Vowel");
        } else
            System.out.println("The Alphabet " + alpha + " is Consonant");
    }

    public static void largestNumberAmongThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The Largest number is " + num1);
            } else
                System.out.println("The Largest number is " + num3);
        } else if (num2 > num3) {
            if (num2 > num3) {
                System.out.println("The Largest number is " + num2);
            } else
                System.out.println("The Largest number is " + num3);
        }
    }

    public static void main(String[] args) {
        System.out.println("---Welcome to Basic Core Programs Stimulation---");
        System.out.println("1) Flip coin Simulation and print percentage of Heads and Tails.");
        System.out.println("2) To Show which Year is Leap Year.");
        System.out.println("3) Leap Year programming with power of 2.");
        System.out.println("4) To print the Nth Harmonic Number.");
        System.out.println("5) To find the Prime Factors of number given by user.");
        System.out.println("6) To Compute the Quotient and Remainder of number given by user.");
        System.out.println("7) To Swap Two Numbers.");
        System.out.println("8) Check whether a number is Even or Odd.");
        System.out.println("9) Check whether an Alphabet is Vowel or Consonant.");
        System.out.println("10) Find the largest among three numbers.");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number to print the Program :");
        int inNum = scr.nextInt();
        switch (inNum) {
            case 1:
                flipCoinSimulator();
                break;
            case 2:
                leapYear();
                break;
            case 3:
                powerof2();
                break;
            case 4:
                harmonicNumber();
                break;
            case 5:
                primeFactors();
                break;
            case 6:
                quotientandRemainder();
                break;
            case 7:
                swapToNumbers();
                break;
            case 8:
                numberEvenandOdd();
                break;
            case 9:
                vowelandConsonantCheck();
                break;
            case 10:
                largestNumberAmongThree();
                break;
            default:
                System.out.println("Your Program is terminated as you have entered wrong number.");
        }
    }
}