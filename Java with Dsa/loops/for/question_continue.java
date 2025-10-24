import java.util.Scanner;
public class question_continue {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("enter a number");
          int n=sc.nextInt();
          if(n%10==0){
            System.out.println("it's a multiple of 10");
            continue;
          }
          System.out.println("the number is :"+n);

    }
}
   
}
