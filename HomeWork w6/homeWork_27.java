import java.util.Scanner;

public class homeWork_27 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);               //girdi al
        int n = inp.nextInt();
        double toplam = 0;
        int s = 0;
        for (int i = 1; i <= n; i++) {                      //girdi bölen sayıları topla
            if (n % i == 0) {
                toplam += i;
                s += 1;
            }
        }
        if ((toplam / s) % 1 == 0) {                        //toplamı bölen sayısına böl
            System.out.println("aritmatik");
        } else {
            System.out.println("aritmetik sayı değildir ");
        }
    }

}
