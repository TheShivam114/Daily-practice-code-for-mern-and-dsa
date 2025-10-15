import java.util.Scanner;
public class reverse_number {

  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    // for(int var0=sc.nextInt();var0>0;var0/=10)
    // {
    //   int var1=var0%10;
    //   System.out.print(var1);
    // }
    int var0=sc.nextInt();
    int rev=0;
    while(var0>0)
    {
      int lastdigit=var0%10;
      rev=(rev*10)+lastdigit;
      var0/=10;
    }
    System.out.println(rev);
  }
}