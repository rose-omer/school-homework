import java.util.Arrays;
import java.util.Scanner;

public class homeWork_43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" 1 den N e kadar olan sayıların kareleri toplamı   N  gir==> ");
        int n = input.nextInt();
        int[] sayılar = new int[n];
        System.out.println(Arrays.toString(sayılar));
        System.out.println(Arrays.toString(sort(sayılar)));
    }

    //diziyi sıralayan methot
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
