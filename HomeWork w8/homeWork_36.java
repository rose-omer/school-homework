import java.util.Scanner;

public class homeWork_36 {
    public static void main(String[] args) {
        System.out.println("bir kelime giriniz ==>");
        Scanner inp = new Scanner(System.in);
        String txt = inp.nextLine();
        String yazar = "";
        int sınır = txt.length();
        System.out.println("ilk parcadan ve ikinci parcadan alarak");
        for (int i = 0; i < sınır / 2; i++) {
            yazar += txt.charAt(i);
            yazar += txt.charAt(sınır - i - 1);
        }
        System.out.println(yazar);
        String yazar2 = "";
        for (int i = yazar.length() - 1; i >= 0; i--) {
            yazar2 += yazar.charAt(i);
        }
        System.out.println(yazar2);

    }
}