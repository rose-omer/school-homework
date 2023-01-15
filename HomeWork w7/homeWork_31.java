import java.util.Arrays;
import java.util.Scanner;

public class homeWork_31 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç elamanlı dizi olacak==>");
        int n = inp.nextInt();
        System.out.println();

        int[] sayilar = new int[n];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". Elamanı girin==> ");
            sayilar[i] = inp.nextInt();
        }

        int pozitif = 0;                                                                         //pozitif elaman sayısı
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 0) {
                pozitif += 1;
            }
        }

        int[] pa = new int[pozitif];
        int[] na = new int[n - pozitif];                    //tüm sayılar - pozitif=negatif
        int syc = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 0) {
                pa[syc] = sayilar[i];
                syc ++;
            }
        }
        syc = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 0) {
                na[syc] = sayilar[i];
                syc ++;
            }
        }
        System.out.println();
        System.out.println("** POZİTİF SAYILAR **");
        System.out.println("----------------------");
        for (int i = 0; i < pa.length ; i++) {
            System.out.print(pa[i]+"  ");
        }
        System.out.println();
        System.out.println("** NEGATİF SAYILAR **");
        System.out.println("----------------------");
        for (int i = 0; i < na.length ; i++) {
            System.out.print(na[i]+"  ");
        }

    }

}

