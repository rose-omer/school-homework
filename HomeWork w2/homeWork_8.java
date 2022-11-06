package örnekler;
import java.util.Scanner;

public class homeWork_8 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int a,b,c;
        System.out.print("ilk sayıyı giriniz :");
        a = oku.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        b = oku.nextInt();
        System.out.print("üçüncü sayıyı giriniz :");
        c = oku.nextInt();
        double sayı1 = a;
        double sayı2 = b;
        double sayı3 = c;
        double enBuyuk = sayı1;
        if(enBuyuk <sayı2){
            enBuyuk = sayı2;
        }
        
        if (enBuyuk<sayı3){
            enBuyuk = sayı3;
        }
        
        System.out.println("En Büyük sayı :  "+enBuyuk);
 
        
    }
    
}
