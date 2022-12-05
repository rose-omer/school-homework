//TRİBONACCİ SAYILARI

import java.util.Scanner;

public class odev115 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Terim sayısı girin");
        n = input.nextInt();
        int T1 = 1, T2 = 1, T3 = 2;
        System.out.print(T1 + " " + T2 + " " + T3);  //tribonacci serisinin kurallarına göre işlemler uygulanır ve alınan terim sayısı kadar tribonacci sayısı listelenir
        for (int i = 1; i <= n - 3; i++) {
            int T4 = T1 + T2 + T3;
            System.out.print(" " + T4);
            T1 = T2;
            T2 = T3;
            T3 = T4;
        }
        System.out.println("");
    }

}
