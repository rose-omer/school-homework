// BAĞDAŞIK SAYILAR

import java.util.Scanner;

public class odev99 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("İlk sayıyı girin");
        x = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        y = input.nextInt();
        int a = x % 10;  //x sayısının birler basamağı
        int b = y % 10;  //y sayısının birler basamağı
        int c = x / 10;  //x sayısının onlar basamağı
        int d = y / 10;  //y sayısının onlar basamağı
        if (a + b == 10 && c == d) {  //bağdaşık sayı olma kuralı
            System.out.println(x + " ve " + y + " Bağdaşık sayılardır.");
        } else {
            System.out.println(x + " ve " + y + "Bağdaşık sayılar değildir.");
        }
    }

}
