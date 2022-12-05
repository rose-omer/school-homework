//altın oran

import java.util.Scanner;
import java.util.*;

public class odev83 {


    public static void main(String[] args) {
        double ab,cb,ac;
        Scanner klavye=new Scanner(System.in);
        System.out.println("DOĞRU PARÇASI UZUNLUĞUNU GİRİNİZ : ");
         ab=klavye.nextInt();
         cb=2*ab/(1+Math.pow(5,0.5));
         ac=ab-cb;
         System.out.println("AC==>"+ac);
         System.out.println("BC==>"+cb);
    }
}
