import java.util.Scanner;
public class inputFromUser {
  public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n =sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter array element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("array element are:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
