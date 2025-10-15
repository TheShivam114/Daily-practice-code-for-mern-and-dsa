import java.util.Scanner;
public class tax {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your sallary");
        int income = sc.nextInt();
        int tax;
        if(income<=500)
        {
            tax=0;
        }
        else if(income>=500 && income<=1000)
        {
            tax=(int) (income*0.2); 
        }
        else
        {
            tax=(int) (income*0.3);
        }
        System.out.println("the tax of your salarry is :"+ tax);
    }
}
