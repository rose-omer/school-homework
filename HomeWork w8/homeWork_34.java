//iki büyük iki küçük

import java.util.Scanner;

public class homeWork_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz ==> ");
        String txt = input.nextLine();
        int sayac = 1;
        for (int i = 0; i < txt.length(); i++) {
            if (i % 2 == 0) {
                sayac *= -1;
            }
            if (sayac == 1) {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            if (sayac == -1) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }

        }

    }

}
