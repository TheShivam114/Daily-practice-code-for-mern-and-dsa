import java.util.*;
public class string {
  public static void main(String[] args){
     
    // char arr[]={'a','b','c','d'};
          //input in String
          String str="abcde";
          //or
          String str2=new String("abcs");
          System.out.println(str2);
          //String are immulable;

    //input output
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your first name");
          String name= sc.next();//sc.next it's not include any space but if we use nextLine() then it's possible;
        //   int a=sc.nextInt();
        System.out.println("enter your last name");
        sc.nextLine();
        String lastname=sc.nextLine();
        //String concatination
       String fullname=name+" "+lastname;
        System.out.println(fullname);
        //string length  : it is a function .length();
        System.out.println(fullname.length());
         // String concatination
         String firstname="shivam";
         String secondname="kumar";
         String full=firstname+" "+secondname;
         System.out.println(full);

    

        


  }  
}
