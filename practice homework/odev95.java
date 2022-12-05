// Leyland Sayıları

import java.util.Scanner;

public class odev95 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        //x>1 ve y>1 kuralı var
        //Leyland sayısı olmak için x^y+y^x şeklinde elde edilebilmeli
        System.out.println("İlk sayıyı girin");
        x = input.nextInt();
        System.out.println("İkinci sayıyı girin");
        y = input.nextInt();
        System.out.println("LEYLAND SAYILARI:");
        System.out.println(" ");
        for (int i = 2; i <= x; i++) {  //sayı 1'den büyük olacağı için aralık 2'den başlar, sayıya kadar gider
            for (int j = 2; j <= y; j++) {
                System.out.println(Math.pow(j, j) + Math.pow(j, i));  //Leyland sayısı kuralı
            }
        }
    }

}
