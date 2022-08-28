package mh1;

import java.util.Locale;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        Double quantidade = input.nextDouble();

        double media = distancia / quantidade;

        System.out.printf("%.3f km/l%n", media);


        input.close();

    }
}
