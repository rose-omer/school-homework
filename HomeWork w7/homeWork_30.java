
import java.util.Scanner;

public class homeWork_30 {
    public static double f(double x, double[] a) {
        double toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam += a[i] * Math.pow(x, a.length - i - 1);
        }
        return toplam;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("  polinom derecedsi ne olsun : ");
        int n = inp.nextInt();
        System.out.println();

        System.out.println("Hangi x değeri hesaplacak : ");
        double x = inp.nextInt();

        double[] katsayı = new double[n + 1];

        for (int i = 0; i < katsayı.length; i++) {
            System.out.println((i + 1) + ". Katsayıyı girin");
            katsayı[i] = inp.nextDouble();
        }

        String b = "";
        for (int i = 0; i < katsayı.length; i++) {
            if (i == katsayı.length - 1) {
                b += katsayı[i] + "x^" + (katsayı.length - i - 1);
            } else {
                b += katsayı[i] + "x^" + (katsayı.length - i - 1) + " + ";
            }

        }
        System.out.println("Formülünüz: " + b);

        System.out.println(f(x, katsayı));
    }
}
