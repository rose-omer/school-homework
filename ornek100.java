
import java.util.Scanner;

public class ornek100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int t = 0;
        System.out.println("Kontrol edilecek sayıyı giriniz");
        x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                t = t + i;
            }
        }
        if (t < 2 * x) {
            System.out.println(x + " eksik sayıdır ve eksiklik miktarı " + (2 * x - t) + "'dir.");
        } else {
            System.out.println(x + " Eksik sayı değildir");
        }
    }

}
