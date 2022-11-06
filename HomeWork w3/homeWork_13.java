
import java.util.Scanner;
class homeWork_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi 1:");
        int sayi1=input.nextInt();
        System.out.print("Sayi 2:");
        int sayi2=input.nextInt();
        int toplam=0;
        for(int i=0;i<sayi2;i++){
            toplam+=sayi1;
        }
        System.out.println("Carpim: "+toplam);}
}