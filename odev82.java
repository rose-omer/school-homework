
import java.util.Scanner;

public class odev82 {

    public static void main(String[] args) {
        double t = 1;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bölme sayısı : ");
        int n = klavye.nextInt();
        for (int i = 0; i < n; i++) {
            t = 4 + 1 /t;

        }
        System.out.printf("Karekök(2)=%f\n", 2 + 1 / t);

    }

}
