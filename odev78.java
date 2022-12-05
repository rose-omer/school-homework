//John wallis
import java.util.Scanner;
import java.util.*;
public class odev78 {
    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("TERİM SAYISINI GİRİNİZ,  :  ");
        int n=klavye.nextInt();
        double c=1,c1;
        for (int i = 1; i < n; i++) {
             c1=4*i*i;
             c=c*c1/(c1-1);
             
        }
        double sonuc=2*c;
        System.out.println(sonuc);
    }
    
    
}
