//Büyük Harf Tahmini

import java.util.Random;
import java.util.Scanner;

public class odev73 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Random rastgele = new Random();
        int rast, s = 0;
        rast = rastgele.nextInt(25) + 65; //65den  90 ye kadar sayı üretiyor.
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("BİR BÜYÜK HARF KODU GİRİNİZ 65 İLE 90 ARSINDA SAYISAL DEĞER GİRİNİZ : ");
            int Tahmin = klavye.nextInt();
            if (rast > Tahmin) {
                System.out.println("Tahminiz Yanlış DAHA YUKARIII ...");
            } else if (rast < Tahmin) {
                System.out.println("Tahminiz Yanlış DAHA  AŞŞAĞIII ...");

            } else if (Tahmin == rast) {
                System.out.println("Tahmininiz doğru tebrikler    " + (char) rast);
                break;
            } else {
                System.out.println("Ne yazık ki 10 denemede bulamadınız Harf=>" + (char) rast); //ürettiği sayıları char türüne dönüştürüyor.

            }
            s++;

        }

    }

}
