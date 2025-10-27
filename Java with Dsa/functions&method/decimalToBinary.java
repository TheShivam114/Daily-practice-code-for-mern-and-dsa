import java.util.Scanner;

public class decimalToBinary {
     public static void convert(int decimalNumber){
        int p=0;
        int bin=0;
        while(decimalNumber>0){
            int rem=decimalNumber%10;
            bin=bin+rem* (int)Math.pow(10,p);
            p++;
        }
        System.out.println("decimal number :"+dec);
       
    }
    public static void main(String[] args){
        System.out.println("enter a decimal number");
           Scanner sc=new Scanner(System.in);
           int decimal=sc.nextInt();
           sc.close();
          convert(decimal);
    }
}
