/*print 1 to n */
public class printAcc {
    public static void printacc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printacc(n-1);
       System.out.print(n+" ");
    }
    public static void main(String[] args){
         printacc(10);
    }
}
