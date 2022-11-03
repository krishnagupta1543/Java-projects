package Interspedia;

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temprature in Celsius: ");
        double c = in.nextDouble();

        double f = toFahrenheit(c);
        double k = toKelvin(c);

        System.out.println(c+" celsius is equal to "+f+" fehrenheit");
        System.out.println(c+" celsius is equal to "+k+" kelvin");
    }

     static double toKelvin(double c) {
         return c + 273.15;
    }

    static double toFahrenheit(double c){
        return c*(1.8)+32;
    }
}
