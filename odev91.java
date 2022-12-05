//Mükemmel sayı
import java.util.Scanner;

public class odev91 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Bir tamsayı giriniz");
        n = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < n - 1; i++) { //tam bölenlerini aramak için döngü
            if (n % i == 0) {  //tam bölenler bulunur
                toplam = toplam + i;  // tam bölenler toplanır
            }
        }
        if (n == toplam) {  //mükemmel sayı olma kuralı
            System.out.println("Mükemmel sayı");
        } else {
            System.out.println("Mükemmel sayı değil");
        }
    }
}
