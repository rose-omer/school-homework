//Asal sayılar

import java.util.Scanner;

public class odev86 {

    public static void main(String[] args) {
        int sayi, sayac;
        Scanner scan = new Scanner(System.in);
        System.out.println("Belirlenen aralıktaki Asal Sayılar");
        System.out.println("üst sınır==>  ");
        sayi = scan.nextInt();
        System.out.println("\n+++ASAL SAYILAR+++\n\n");
        while (sayi >= 2) {

            sayac = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(sayi + " asal bir sayidir.");
            }
            sayi--;
        }

    }
}
