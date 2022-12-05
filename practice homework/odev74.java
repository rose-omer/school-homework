//e üzeri

import java.util.Scanner;

public class odev74 {

    public static void main(String[] args) {
        int N;
        double X, T = 1, F = 1;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Terim Sayısı Giriniz  :  ");
        N = klavye.nextInt();
        System.out.println("Hesaplanacak X Değerini Giriniz  :  ");
        X = klavye.nextDouble();
        for (int i = 0; i < N; i++) {
            F *= i;
            T += Math.pow(X, i) /F;
        }
        System.out.printf("\nSeri açılımı ile e üzerix değeri  :  %.5f\n",T);
        System.out.printf("Komutla e üzeri x değeri : %.5f\n", Math.exp(X));
    }

}
