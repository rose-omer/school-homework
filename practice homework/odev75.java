//binom acılımı

import java.util.Scanner;

public class odev75 {

    public static void main(String[] args) {
        double x, n, sonuc;
        Scanner klavye = new Scanner(System.in);
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.print("x: ");
        x = klavye.nextDouble();
        System.out.print("n: ");
        n = klavye.nextDouble();
        sonuc = Math.pow((1 + x / n), n);
        System.out.printf("\nexp(%f)=%f\n", x, sonuc);
    }
}
