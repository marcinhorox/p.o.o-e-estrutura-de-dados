package mh1;

import java.util.Locale;
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double content = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
        double distance = Math.sqrt(content);
        System.out.printf("%.4f\n",distance);

        input.close();
    }
}
