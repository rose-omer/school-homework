
//Karakök(3)

import java.util.Scanner;

public class odev81 {
    public static void main(String[] args) {
        double t = 1;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bölme sayısı : ");
        int n = klavye.nextInt();
        for (int i = 0; i < n-1; i++) {
            t = 1 + 1 /(2+1/t);

        }
        System.out.printf("Karekök(2)=%f\n", 1 + 1 / t);        
    }
    
}
