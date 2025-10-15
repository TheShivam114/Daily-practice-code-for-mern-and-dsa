import java.util.Scanner;
public class calculator {
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number a: ");
    int a=sc.nextInt();
    System.out.println("enter a second number b: ");
    int b=sc.nextInt();
    System.out.println("enter a operator: ");
    char op=sc.next().charAt(0);
    switch(op)
    {
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        default: System.out.println("not matched");
    }
  }  
}
