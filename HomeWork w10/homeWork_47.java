import java.util.Scanner;

public class homeWork_47 {
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Dışarıdan alınan n değerine göre yıldızlarla üçgen oluşturma ");
        System.out.print(" N  gir==> ");
        int n = input.nextInt();
        yıldız(n);
    }

    public static void yıldız(int yıldız) {
        for (int i = 1; i <= yıldız; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
