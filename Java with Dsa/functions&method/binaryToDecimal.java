import java.util.Scanner;
public class binaryToDecimal {
    public static void convert(int binaryNumber){
        int p=0;
        int dec=0;
        while(binaryNumber>0){
            int lastDigit=binaryNumber%10;
            dec=dec+(lastDigit*(int)Math.pow(2, p));
            p++; 
            binaryNumber=binaryNumber/10;
        }
        System.out.println("decimal number :"+dec);
       
    }
    public static void main(String[] args){
        System.out.println("enter a binary digit");
           Scanner sc=new Scanner(System.in);
           int binary=sc.nextInt();
           sc.close();
          convert(binary);
    }
}
