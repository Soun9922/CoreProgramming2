package FunctionalProgramming;

import java.util.Scanner;

public class windChill {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter temperature (Fahrenheit): ");
        double t = scr.nextInt();
        System.out.println("Enter Wind Speed (miles/hr): ");
        double v = scr.nextInt();
        if (t < 50 && v > 3 && v < 120) {
            double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
            System.out.println("WindChill is = " + wind);
        } else
            System.out.println("Temperature should be less than 50 and wind speed should be greater than 3 and less than 120");
    }
    }



