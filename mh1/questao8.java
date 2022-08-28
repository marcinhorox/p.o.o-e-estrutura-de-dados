package mh1;

public class questao8 {
    public static void main(String[] args) {

        int funcionario = 25;
        int quantidadehorastrabalhadas = 100;
        double valorhora = 5.50;
        double salario =  quantidadehorastrabalhadas * valorhora;

        System.out.println("NÚMERO = " + funcionario);
        System.out.printf("SALÁRIO = R$ %.2f%n", salario);
    }
}
