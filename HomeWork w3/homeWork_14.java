import java.util.Scanner;
public class homeWork_14 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");
 
        int sayi = reader.nextInt();
        int toplam = 0;
 
        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i*i;
        }
 
        System.out.println("Sayıların Toplamı = " + toplam);
    }
}
