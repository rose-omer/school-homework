import java.util.Scanner;

public class odev92 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , s = 0 ;
        double a = 1 , b = 1 ;  //formülü parçalara ayıracağımız için a ve b değişkenlerini atadık
        System.out.println("Üst sınır girin");
        n = input.nextInt();
        System.out.println("Mükemmel Sayılar:");
        for (int i = 1; i <= n; i++) {  //mükemmel sayıların bulunması için aralıklı döngü
            a = Math.pow(2, i) ; //a karakterini formülden çektiğimiz 2^n elemanına atadık
            b = Math.pow(2, i+1) - 1 ;  // b karakterini formülde geriye kalan elemana atadık
             for (int j = 2 ; j<b ; j++)  //buradan itibaren b karakterimiz asal mı o kontrol edilir
        {
            if (b % i == 0)    
        {
            s++ ;
        }
        }
            if (s==0)  {
                
            }
            System.out.println(a*b);  //mükemmel sayılar listelenir
        }        
    }
    
}
