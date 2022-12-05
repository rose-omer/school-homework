
import java.util.Scanner;
public class odev69 {

    public static void main(String[] args) {
        int N, is ;
        double aci, X,  f, T = 1;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Açı değeri (derece) : ");
        aci = klavye.nextDouble();
        System.out.println("Terim sayısı : ");
        N = klavye.nextInt();
        X = Math.toRadians(aci);
        is = 1;
        for (int i = 1; 1 <N; i++) {
            f = 1;
            for (int j = 1; j <= 2 * i; j++)
                f*= i;
            is*=(-1);
            T+=is*Math.pow(X,2*i)/f;
        }
        System.out.printf("\nseri acılımı ilehesaplanan değer : %0.5f\n" , T);
        System.out.printf("KOMUTLA HESAPLANAN DEĞER : %5f", Math.cos(X));
    }
}
