// FİBONACCİ SAYILARI

import java.util.Scanner;

public class odev111 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N; //terim sayısı
        System.out.println("Terim sayısı girin");
        N = input.nextInt();
        System.out.println("Fibonacci Serisi:");
        int T1 = 1, T2 = 1;  //işlemler için
        System.out.print(T1 + " " + T2);  //sayılar atanır
        for (int i = 1; i <= N - 2; i++) {
            int T3 = T1 + T2;  //fibonacci t3
            System.out.print("--" + T3);
            T1 = T2;
            T2 = T3;
        }
        System.out.println("");
    }

}
