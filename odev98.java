//ARMSTRONG SAYILAR

public class odev98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Armstrong Sayılar 100-999");
        for (int i = 1; i <= 9; i++) { //Yüzler basamağı
            for (int j = 0; j <= 9; j++) { //Onlar basamağı
                for (int k = 0; k <= 9; k++) {  //Birler basamağı
                    int sayi = 100 * i + 10 * j + k;  //sayı oluşturulur
                    if (sayi == Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) {  //Armstrong sayı kuralı
                        System.out.println(sayi);  //sayılar listelenir
                    }
                }
            }
        }
    }

}
