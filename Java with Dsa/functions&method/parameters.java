import java.util.Scanner;
public class parameters {
    public static int sum(int num1,int num2){
           int sum=num1+num2;
           return sum;
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.close();
      int s=sum(a,b);
      System.out.println(s);

   } 

}
