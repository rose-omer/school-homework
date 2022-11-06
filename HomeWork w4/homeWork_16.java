package w4;

import java.util.Scanner;

public class homeWork_16 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("BİR SAYI GİTRİNİZ : ");
        int sayi = reader.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;
        int toplam3 = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam1 += i;
        };
        System.out.println("TÜM Sayıların Toplamı = " + toplam1);
        for (int i = 1; i <= sayi; i = i + 2) {
            toplam2 +=i;
        }
        System.out.println("TEK Sayıların Toplamı = " + toplam2);
        for (int i = 0; i <= sayi; i = i + 2) {
            toplam3 +=i;
        }
        System.out.println("ÇİFT Sayıların Toplamı = " + toplam3);


    }

}
