package örnekler;

import java.util.Scanner;

public class homeWork_4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print(" Kütle Değerini Girin: ");
        int Kütle = reader.nextInt();
        System.out.print(" Hız Değerini Girin: ");
        int Hız = reader.nextInt();
        System.out.print(" Yerden Yükseklik  Değerini Girin: ");
        int yüksek = reader.nextInt();
        int potansiyel = Kütle * 10 * yüksek;
        int kinetik = Kütle * Hız * Hız / 2;
        System.out.println("Potansiyel enerji  : " + potansiyel);
        System.out.println("Kinetik enerji  : " + kinetik);

    }

}
