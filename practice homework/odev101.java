//tau sayılar

import java.util.Scanner;

public class odev101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Bir üst sınır giriniz");
        n = input.nextInt();
        System.out.println(" ");
        System.out.println("Tau sayıları:");
        for (int i = 1; i <= n; i++) { //klavyeden alınan sayının tam bölenleri bulunur
            int s = 0;  //s ile tam bölenlerinin kaç tane olduğu birer artarak sayılır
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s++;
                }
            }
            if (i % s == 0) {  //sayılar listelenir
                System.out.println(i);
            }
        }
    }

}
