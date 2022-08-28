package mh1;

import java.util.Locale;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double pi = 3.14159;


        double  triangulo =  (A * C / 2.0);
        double circulo = pi * Math.pow(C, 2);
        double trapezio = A + B * C / 2.0;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("triangulo: %.3f%n", triangulo);
        System.out.printf("circulo: %.3f%n", circulo);
        System.out.printf("trapezio: %.3f%n", trapezio);
        System.out.printf("quadrado: %.3f%n", quadrado);
        System.out.printf("retangulo: %.3f%n", retangulo);

        input.close();

    }


}
