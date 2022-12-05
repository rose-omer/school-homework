//HETEROMETRİK SAYI

import java.util.Scanner;

public class odev102 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Terim sayısı girin");  //kaç tane heterometrik sayı yazdıracağımızın sayısını klavyedenn aldık
        n = input.nextInt();
        System.out.println("Terim sayısı kadar Heterometrik sayılar:");
        for (int i = 1; i <= n; i++) {  //n kadar devam eder
            System.out.print(i * (i + 1));  //heterometrik sayıları bulur ve açık şekilde yazar
            System.out.print("=");
            System.out.print(i + "*");
            System.out.print("(" + i);
            System.out.print("+1)");
            System.out.println("");
        }
        System.out.println();
    }

}
