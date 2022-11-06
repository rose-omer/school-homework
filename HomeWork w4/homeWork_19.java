package w4;
import java.util.Scanner;

public class homeWork_19 {
    public static void main(String[] args) {
          int n, reverse = 0;
 
        System.out.println("Bir tam sayı girin :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
 
        while(n != 0)
        {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
        }
 
        System.out.println("Ters çevrilen tam sayı " + reverse);
    }
}
