import java.util.Random;
import java.util.Scanner;

public class homeWork_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz ==> ");
        String txt = input.nextLine();
        Random r = new Random();
        for (int i = 0; i < txt.length(); i++) {
            int ra = r.nextInt(txt.length());
            if (ra % 2 == 0) {
                System.out.print(Character.toLowerCase(txt.charAt(i)) + "");
            } else {
                System.out.print(Character.toUpperCase(txt.charAt(i)) + "");
            }
        }

    }

}
