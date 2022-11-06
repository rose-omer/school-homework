package W4;

import java.util.Scanner;

public class homeWork_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(i + "  bir bölendir");
            }
        }

    }
}
