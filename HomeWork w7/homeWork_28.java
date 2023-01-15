import java.util.Scanner;

public class homeWork_28 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin elaman sayısını girin");                //dizi ucunluğu
        int n = inp.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("A dizisi için değer girin==>");                  //a dizisi elemanları
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "değeri");
            A[i] = inp.nextInt();
        }
        System.out.println("B dizisi için değer girin==>");                  //b dizisi elemanları

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "değeri");
            B[i] = inp.nextInt();

        }

        int sonuc = 0;                                                      //skaler carpma
        for (int i = 0; i < A.length; i++) {
            sonuc += A[i] * B[i];
        }
        System.out.println(sonuc);                                          //yazdırma
    }
}
