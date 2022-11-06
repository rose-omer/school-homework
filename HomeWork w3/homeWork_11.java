import java.util.Scanner;

public class homeWork_11 {
    public static void main(String[] args) {
                Scanner klavye=new Scanner(System.in);
		 
		 System.out.println("Üçgen türü bulma programina hosgeldiniz");
                 
		 System.out.println("Lütfen üçgenin ilk kenar uzunluğunu yazın");
		 int a=klavye.nextInt();
                 
		 System.out.println("Lütfen üçgenin ikinci kenar uzunluğunu yazın");
		 int b=klavye.nextInt();
                 
		 System.out.println("Lütfen üçgenin ucuncu kenar uzunluğunu yazın");
		 int c=klavye.nextInt();
                 
                 
		 if (a==b && b==c)
			 System.out.println("üçgen eşkenar üçgendir");
		 else if (a==b || a==c || b==c)
			 System.out.println("üçgen ikizkenar üçgendir");
		 else
			 System.out.println("üçgen çeşitkenar üçgendir");
		 
	    }
    
}
