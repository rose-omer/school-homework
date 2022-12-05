//Madhava of Sangamagarama
import java.util.Scanner;
import java.util.*;
public class odev77 {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Terim sayısını giriniz  : ");
        int n = klavye.nextInt();
        double t = 0;

        for (int i = 1; i <= n - 1; i++) {

            t = t +  Math.pow(-1, i) / ((2 * i + 1) * Math.pow(3, i));
        }
        double sonuc = ((12) ^ (1 / 2)) * t;
        System.out.println(sonuc);
    }

}
