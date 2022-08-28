package mh1;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maior = (a+b+Math.abs(a-b))/2;
        int maior1 = (maior + c + Math.abs(maior - c)) / 2;

        System.out.printf(maior1+ " eh o maior");

        input.close();



    }
}
