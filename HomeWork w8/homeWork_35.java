import java.util.Scanner;

public class homeWork_35 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("LÜTFEN KÜÇÜK HARFLER İLE KELİME YAZ==>");
        char[] sesliharf = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        String txt = inp.nextLine();
        String k1 = "";
        String k2 = "";
        int kon;

        for (int i = 0; i < txt.length(); i++) {
            kon=0;
            for (int j = 0; j < sesliharf.length; j++) {
                if (txt.charAt(i) == sesliharf[j]) {
                    kon=1;
                    break;
                }
            }
            if (kon == 1) {
                k1 += txt.charAt(i);
            }
            else{
                k2 += txt.charAt(i);

            }
        }
        System.out.println("SESLİLER==> "+k1);
        System.out.println("SESSİZLER==>"+k2);
    }
}
