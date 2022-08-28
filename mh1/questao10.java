package mh1;

import java.util.Locale;
import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float peca1 = input.nextFloat();
        float quantidade1 = input.nextFloat();
        double valor1 = input.nextDouble();
        float peca2 = input.nextFloat();
        float quantidade2 = input.nextFloat();
        double valor2 = input.nextDouble();

        double total = quantidade1*valor1+quantidade2*valor2;

        System.out.printf("valor a pagar: R$ %.2f%n", total);

        input.close();


    }
}
