// keep entering number till user enters a multiple of 10;
import java.util.Scanner;
public class question_break {

    public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
       while(true){
        System.out.println("enter a number");
        int n =sc.nextInt();
        if(n%10==0){
            System.out.println("the number is multiple of 10");
            break;
        }
        System.out.println("the number is "+n);
       }
    }
}