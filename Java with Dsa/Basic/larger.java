import java.util.Scanner;
 class larger
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no");
        int a=sc.nextInt();
        System.out.println("enter your second no.");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("largest no. is "+ a);
        }
        else
        {
            System.out.println("largest no. is"+ b);
        }
    }
}