package örnekler;

import java.util.Scanner;

public class homeWork_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit derecesini giriniz  :  ");
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32) / 1.8;
        System.out.println("Celcius derecesi  :  "+celcius); 
            }
    
}
