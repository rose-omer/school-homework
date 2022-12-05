//PALİNDROM SAYILAR

public class odev106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("100-9999 arası Palindrom sayılar:");
        System.out.println(" ");
        for (int i = 1; i <= 9; i++) { //üç basamaklıların birler ve yüzler basamağı için
            for (int j = 0; j <= 9; j++) {  //üç basamaklıların onlar basamağı için
                System.out.println(100 * i + 10 * j + i);  //üç basamaklı sayılar sırayla listelenir
            }
        }
        System.out.println(" ");

        for (int i = 1; i <= 9; i++) {  //dört basamaklı sayıların binler ve birler basamağı için
            for (int j = 0; j <= 9; j++) {  //dört basamaklı sayıların onlar ve yüzler basamağı için
                System.out.println(1000 * i + 100 * j + 10 * j + i);  //dört basamaklı sayılar sırayla listelenir
            }
        }
    }

}
