import java.util.Scanner;

public class homeWork_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     //girdi alınıyor
        int a = input.nextInt();
        int b = input.nextInt();
        int ta = 0;
        int tb = 0;
        for (int i = 1; i < a - 1; i++) {
            if (a % i == 0) {
                ta += i;
            }
        }
        for (int i = 0; i < b - 2; i++) {                           //carpanlar kontrol edilip toplanıyor
            if (b % i == 0) {                                       // a ve b icin
                tb += 1;
            }
        }
        if (ta == b && tb == a) {
            System.out.println("Dost sayı");                    //carpanlar toplamı eşitmi diye kontrol ediliyor
        } else {
            System.out.println("Dost sayı değil");                  //eşit ise dost sayı değilse dost sayı değil
        }
    }
}