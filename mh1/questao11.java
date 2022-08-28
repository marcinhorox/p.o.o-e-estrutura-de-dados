package mh1;

import java.util.Locale;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble();
        double volume =  4/3.0*pi*Math.pow(raio, 3);

        System.out.printf("volume =  %.3f%n", volume);


        input.close();
    }

    }
