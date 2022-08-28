package mh1;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class questao9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String Funcionario = input.next();
        double salario = input.nextDouble();
        double vendasefetuadas = input.nextDouble();
        double comissao = vendasefetuadas * 0.15;
        double salariofinal =  salario + comissao;


        System.out.printf("total = R$ %.2f%n", salariofinal);

        input.close();

    }
}
