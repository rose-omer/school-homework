//monte corlo deneyleri

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class odev79 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kare kenar uzunluğubju giriniz : ");
        int k = klavye.nextInt();
        System.out.println("kaç nakto konulsun : ");
        int m = klavye.nextInt();
        Random r = new Random(); //random sınıfı
        int a = r.nextInt(k);
        int b = r.nextInt(k);
        m = 0;
        if (Math.pow(a, 2) + Math.pow(b, 2) < 1) {
            m++;

        }
        System.out.print(4 * m / k
        );

    }

}
