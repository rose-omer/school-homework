
import java.util.Scanner;

class homeWork_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz sayisi:");
        int n = input.nextInt();
        int toplam = 0;
        for (int i = 1; i <= n; i += 2) {
            toplam += i;
        }
        System.out.println("Tek Tayılar Toplam: " + toplam);
    }
}
