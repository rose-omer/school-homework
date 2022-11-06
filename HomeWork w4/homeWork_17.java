
package w4;
import java.util.Scanner;
public class homeWork_17 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("C(n,r) Kombinasyon hesaplanması için");
        System.out.println("n DEĞERİNİ GİRİNİZ  :  ");
        int n = scan.nextInt();
        System.out.println("r değerini giriniz");
        int r =scan.nextInt();
        int total=1;
        int total2=1;
        int total3=1;
        for(int i=1;i<=n;i++)
        {
            total=total*i;
        }
        for(int a=1;a<=r;a++)
        {
            total2=total2*a;
        }
        for(int b=1; b<=(n-r);b++)
        {
            total3=total3*b;
        }
        
        int k=total/(total2*total3);
        System.out.println(k+"   Kombinasyonunuzun sonucudur  !!! ");
    }    
}