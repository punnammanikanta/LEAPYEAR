import java.util.Scanner;

public class Leapyear {

   public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the year");
        int year=scanner.nextInt();
        if(year%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
        scanner.close();    
    }
    
}
    



