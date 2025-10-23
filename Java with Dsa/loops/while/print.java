/* 
import java.util.Scanner;
public class print {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your range");
     int a=sc.nextInt();
    int c=1;
    while(c<=a)
    {
        System.out.print(c);
        c++;
    }
    }
}
*/
//print sum of the first n natural no 
import java.util.Scanner;
class print
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=a)
        {
           sum=sum+i;
           i++; 
        }
        System.out.println(sum);
    }
}