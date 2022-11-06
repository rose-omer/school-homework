package örnekler;
import java.util.Scanner;
public class homeWork_7{
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int a,b;
        System.out.print("ilk sayıyı giriniz :");
        a = oku.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        b = oku.nextInt();
        int T= a+b;
        int F= a-b;
        int C= a*b;
        int B= a/b;
        System.out.println("Toplam ="+T);
        System.out.println("Fark ="+F);
        System.out.println("Çarpım ="+C);
        System.out.println("Bölüm ="+B);
    }
}
