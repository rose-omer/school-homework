//Fermat Sayıları

import java.util.Scanner;

public class odev94 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, i;
        System.out.println("x");
        x = input.nextInt();
        System.out.println("Sarxyılar:");
        for (i = 1; i < x - 1; i++) {
            System.out.println(Math.pow(2, Math.pow(2, i)) + 1);

        }
    }

}
