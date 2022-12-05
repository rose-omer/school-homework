//brother formülü
import java.util.Scanner;


public class odev76 {

    public static void main(String[] args) {
      double t=2, n, f=1;
        Scanner klavye = new Scanner(System.in);
        System.out.printf("(2k+2)\n------\n(2k+1)!\n\n\n");
        System.out.println("Terim sayısını giriniz  : " );
        n=klavye.nextByte();
        for (int i = 1; i <=n ; i++) {
            f*=2*i+1;
            t = t + (2 * i + 2) / f;
        }
        System.out.println(t);
  
    }
}
