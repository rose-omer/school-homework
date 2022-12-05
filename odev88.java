//ASAL CARPANLAR
import java.util.Scanner;
public class odev88 {

    public static void main(String[] args) {
        int a, b=2 ;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Pozitif tamsayı  :  ");
        a=klavye.nextInt();
        System.out.println();
        while(a>1)
        {
            if(a%b==0)
            {
                System.out.printf("%d\t",b);
                a/=b;
            
            }else
                b++;
        }
    }
    
}
