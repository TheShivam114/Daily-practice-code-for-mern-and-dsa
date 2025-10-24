import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println(" enter a number");
        int n=sc.nextInt();
        sc.close();
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println(n+": is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
