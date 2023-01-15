import java.util.Scanner;

public class homeWork_29 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("***sayı dizisi eleman saysını giriniz***");
        int n = inp.nextInt();
        int[] sayı = new int[n];
        System.out.println("***SAYI DİZİSİ***");
        for (int i = 0; i < sayı.length; i++) {
            System.out.print((i + 1) + ". Elemanı girin");
            sayı[i] = inp.nextInt();
        }

        int aritmetik = 0, geometrik = 1,kontraharmonik = 0;
        double harmonik = 0;
        for (int i = 0; i < sayı.length; i++) {
            aritmetik += sayı[i];
            geometrik *= sayı[i];
            harmonik += (1.0 / sayı[i]);
            kontraharmonik += sayı[i] * sayı[i];
        }
        System.out.println("Aritmatik Ortalama: " + aritmetik / n);
        System.out.println("Geometrik Ortalama: " + Math.pow(geometrik, (1.0 / n)));
        System.out.println("Harmonik Ortalama: " + (double) n / harmonik);
        System.out.println("Kontraharmonik Ortalama: " + (double) kontraharmonik / (double) aritmetik);
    }

}
