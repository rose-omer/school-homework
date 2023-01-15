import java.util.Arrays;

public class homeWork_44 {
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4};
        int[] DİZİ2 = {5, 6, 7, 8};

        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(DİZİ2));
        System.out.println(Arrays.toString(dizileritopla(dizi1, DİZİ2)));
    }
    // TOPLAM DÖNDÜREN METOT
    public static int[] dizileritopla(int[] a, int[] b) {
        int[] toplam = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            toplam[i] = a[i] + b[i];
        }
        return toplam;
    }


}


