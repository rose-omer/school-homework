import java.util.Scanner;
public class homeWork_9 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("BİR SAYI GİRİNİZ  :  ");
        
        double sayı = reader.nextInt();
        //sayı 0 dan küçük ise negatiftir // 
        if(sayı<0.0)
            System.out.println(sayı+"   SAYINIZ NEGATİFTİR  ");
        //sayı 0 dan büyük ise pozitif//
        else if(sayı>0.0)
            System.out.println(sayı+"   SAYINIZ POZİTİFTİR  ");
        //aksi halde sayı 0 dır//
        else
            System.out.println(sayı+"   SAYINIZ SIFIRDIR  ");
    }
    
}
