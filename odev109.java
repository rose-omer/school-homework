//üçgensel sayılar

import java.util.Scanner;

public class odev109 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, u;
        System.out.println("Bir tamsayı giriniz");
        n = input.nextInt();
        System.out.println("Üçgensel Sayılar:");
        for (int i = 1; i <= n; i++) {  //döngü açılarak sayılar kontrol edilir, alınan sayı kadar üçgensel sayı bulunacak
            u = ((i * (i + 1)) / 2);   // üçgensel sayı olma kuralı sağlanıyor mu kontrol edilir, üçgensel sayılar bulunur
            System.out.println(u);  // üçgensel sayılar yazdırılır
        }
    }

}
