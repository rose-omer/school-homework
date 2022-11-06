package w5;

import java.util.Scanner;

public class homeWork_23 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sutun sayısı giriniz  :  ");
        int b = inp.nextInt();
        for (int i = b; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
