// Markoff sayıları     

public class odev104 {

    public static void main(String[] args) {
        System.out.println("1-50 arası Markoff sayıları: ");
        for (int i = 1; i <= 50; i++) { //ilk sayı için
            for (int j = 1; j <= 50; j++) { //ikinci sayı
                for (int k = 1; k <= 50; k++) {  //üçüncü sayı
                    if (i * i + j * j + k * k == 3 * i * j * k) {  //markoff sayı kuralı
                        System.out.println(i + "," + j + "," + k);  //sayı kombinasyonları yazdırılır
                    }
                }
            }
        }
    }

}
