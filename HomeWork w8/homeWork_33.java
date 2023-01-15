import java.util.Scanner;

public class homeWork_33 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("HARF BÜYÜKSE KÜÇÜK KÜÇÜK İSE BÜYÜK YAPMA PROGRAMI");
        System.out.println("büyüklü kücüklü kelime gir==>");
        String txt = input.nextLine();

        for (int i = 0; i < txt.length(); i++)
        {
            if(Character.toLowerCase(txt.charAt(i))== txt.charAt(i))            //HARF küçük mü kontrol
            {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else
            {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
        }

    }
}
