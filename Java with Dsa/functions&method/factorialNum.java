public class factorialNum {
    public static int fac(int a)
    {
           int f=1;
           for(int i=1;i<=a;i++)
           {
            f=f*i;
            
           }
           return(f);
    }
    public static void main(String[] args){
        int a=7;
        System.out.println(fac(a));
    }
}
