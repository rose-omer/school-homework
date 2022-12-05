//Hilbert sayısı

import java.util.Scanner;

public class odev96 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Bir tamsayı giriniz");
        n = input.nextInt();
        if ((n - 1) % 4 == 0) {  //Hilbert sayısı olma kuralı-> n=4*k+1 şeklindedir. Bu denklemde k yalnız bırakılır ve bu yoldan ilerlenir
            System.out.println("Hilbert sayısıdır.");
        } else {
            System.out.println("Hilbert sayısı değildir.");
        }
    }

}
