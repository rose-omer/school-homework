package örnekler;

import java.util.Scanner;

public class homeWork_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("derece giriniz ");
        int n = scanner.nextInt();

        double a = (double) Math.toRadians(n);
        System.out.println("radyanımız = " + a);
        double b = n * 200 / 180;
        System.out.println("Gradyant değeriniz  :  " + b);
    }

}
