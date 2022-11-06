
package örnekler;
import java.util.Scanner;
class homeWork_3 {
    public static void main(String[] args) {
        final double PI =3;
        Scanner oku= new Scanner(System.in);
        System.out.print("Kürenin yarı çapını (r) giriniz : ");
        double r= oku.nextDouble();
        double alan=2*PI*Math.pow(r, 2); //
        double hacim=(4/3)*PI*Math.pow(r, 3);
        System.out.println("Alan : "+alan);
        System.out.println("Hacim : "+hacim);
    }
    
}
