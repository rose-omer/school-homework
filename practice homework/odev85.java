//Gümüş oran
import java.util.Scanner;
public class odev85 {

    public static void main(String[] args) {
        double a,b,u;
        Scanner scan =new Scanner(System.in);
        System.out.println("Gümüş oranının hesaplanmasını istediğiniz doğrunun uzunlugunu giriniz :  ");
        u =scan.nextDouble();
        b=u/(2+Math.pow(2, 0.5));
        a=u-b;
        System.out.println("parça1==>  "+a);
        System.out.println("parça2==>  "+b);
    
    }   
    
}
