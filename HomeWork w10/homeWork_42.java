import java.util.Scanner;

public class homeWork_42 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" 1 den N e kadar olan sayıların kareleri toplamı ");
        System.out.print(" N  gir==> ");
        int n = input.nextInt();
        System.out.println(karetoplam(n));
    }

    //KARE TOPLAM METODU
    public static int karetoplam(int n) {
        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i * i;
        }
        return toplam;
    }

}

