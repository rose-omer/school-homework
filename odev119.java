// Floyd üçgeni

import java.util.Scanner;

public class odev119 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir satır değeri alınız");
        int a = input.nextInt();
        int s = 1;  //sayılar başlanır
        for (int i = 1; i <= a; i++) {  //satır sayısı kadar döngü
            for (int j = 1; j <= i; j++) {  //satırdaki eleman sayısı
                System.out.print(s);  //sayılar yazdırılır
                s++;  //sayılar birer birer arttırılır
                System.out.print(" ");   //satır arası boşluk bırakılır
            }
            System.out.println(" "); //sütun arası boşluk bırakılır

            System.out.println();  //sonraki satıra geçilir
        }
    }

}
