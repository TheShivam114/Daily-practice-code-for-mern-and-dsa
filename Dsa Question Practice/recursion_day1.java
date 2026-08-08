/*print no. 10 to 1 in decreasing order */
public class recursion_day1 {
    public static void decprint(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
         System.out.print(n +" ");
         decprint(n-1);
    }
   public static void main(String[] args){
          int n=10;
          decprint(n);
   } 
}
