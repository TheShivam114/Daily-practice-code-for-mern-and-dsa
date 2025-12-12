
public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        //  int nm1=fact(n-1);
         int facn=n*fact(n-1);//int facn=n*nm1;
         return facn;
    }
  public static void main(String[] args){
        System.out.println(fact(5));
  }  
}
