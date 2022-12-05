//altın üçgen

import java.util.Scanner;
import java.util.*;
public class odev84 {

    public static void main(String[] args) {
        double b, a;
        Scanner klavye = new Scanner(System.in);
        System.out.println("İkiz Kenar Üçgenin Kısa Kenarını Giriniz  :  ");
        a = klavye.nextDouble();
        b=a*(1+Math.pow(5, 0.5))/2;
        System.out.println("TÜM KENARLAR \nKISA KENAR : "+a);
        System.out.println(" \nUZUN KENAR : "+b);
        System.out.println(" \nUZUN KENAR : "+b);
        System.out.println(" ");
    }

}
