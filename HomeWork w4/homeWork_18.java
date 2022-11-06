package w4;

import java.util.Scanner;

public class homeWork_18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a = scan.nextInt();
        System.out.println("Signum değeri " + a + " ve " + Integer.signum(a));
    }
}
