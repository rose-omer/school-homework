//Palindromkactane

import java.util.Scanner;

public class odev107 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Basamak sayısı girin");
        n = input.nextInt();  //basamak sayısı aldık
        System.out.println("-----------");
        System.out.print(9 * Math.pow(10, (n - 1) / 2));  //işlemi yaparsak eğer buradan n basamaklı kaç tane palindrom sayı olduğunu bulmuş oluruz. Bizden istenen budur
        System.out.print(" tane " + n + " basamaklı palindrom sayı vardır.");
    }

}
