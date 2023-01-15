import java.util.Scanner;

public class homeWork_24 {
    public static boolean asal(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {                            // gelen sayıyı asal mı diye kontrol ediyor
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (asal(n)) {                                   // sayı çin asalı mı değil mi diye kontrol ediyor
            if (asal(n + 2)) {
                System.out.print("Chen assalı");
            } else {
                System.out.println("Chen asalı değildir" + n);
            }
        } else {
            System.out.println("Chen asalı değildir" + n);
        }
    }
}
