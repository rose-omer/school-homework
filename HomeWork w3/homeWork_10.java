import java.util.Scanner;

public class homeWork_10 {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
       
       int sayi1,sayi;
     
     
       System.out.println("BİR SAYİ GİRİNİZ");
        sayi1=sc.nextInt();
       
        sayi=sayi1%7;
       
        if (sayi==1)
            System.out.println("PAZARTESİ");
        else if(sayi==2)
            System.out.println("SALI");
        else if(sayi==3)
            System.out.println("ÇARŞAMBA");
        else if(sayi==4)
            System.out.println("PERŞEMBE");
        else if(sayi==5)
            System.out.println("CUMA");
        else if(sayi==6)
            System.out.println("CUMARTESİ");
        else 
           System.out.println("PAZAR");
    }
    
}
