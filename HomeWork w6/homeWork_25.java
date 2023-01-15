import java.util.Scanner;
public class homeWork_25 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();                                      //sayı alıyoruz
        int s = 2;
        while (n > 1) {
            if (n % s == 0) {                                       //sayıyı s böleni ile kontrol ediyoruz asal ise yazıyor
                n = n / s;
                System.out.println(s+"  ASAL CARPAN");                //asal carpan değil ise bir artırıyoruz
            } else {
                s += 1;
            }
        }
    }
}
