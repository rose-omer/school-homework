//SAYI TAHMİN OYUNU

import java.util.Scanner;

public class odev72 {

    public static void main(String[] args) {
        int BS, Tahmin, s = 0;
        Scanner klavye = new Scanner(System.in);
        BS = (int) (Math.random() * 98) + 1;
        do {
            System.out.println("Tahmininiz :");
            Tahmin = klavye.nextInt();
            s++;
            if (Tahmin > BS) {
                System.out.println("Daha Küçük Sayı Giriniz...");
            }
            if (Tahmin < BS) {
                System.out.println("Daha Büyük Sayı Giriniz...");
            }
            System.out.println("");
        } while (Tahmin != BS);
        System.out.println(s + "   Tahminde buldunuz....");
    }
}
