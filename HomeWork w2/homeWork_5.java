package örnekler;

import java.util.Scanner;

public class homeWork_5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print(" Direnç Değerini Girin: ");
        int direnc = reader.nextInt();
        System.out.print(" Akım Değerini Girin: ");
        int akım = reader.nextInt();
        int gerilim = direnc / akım;
        System.out.println(" Gerilim değeri  : " + gerilim);
    }

}
