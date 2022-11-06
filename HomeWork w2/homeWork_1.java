package örnek1;

import java.util.*;

public class homeWork_1 {

    public static void main(String[] args) {

        int taban, yukseklik, alan;
        Scanner Klavye = new Scanner(System.in);
        System.out.print("Taban Değeri:");
        taban = Klavye.nextInt();
        System.out.print("Yükseklik Değeri:");
        yukseklik = Klavye.nextInt();
        alan = (taban * yukseklik) / 2;
        System.out.println("Üçgen alanı  =  " + alan);

    }
}
