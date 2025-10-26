public class binomialCofi {
    public static int factorial(int a){
        int temp=1;
        for(int i=1;i<=a;i++){
            temp=temp*i;
        }
        return temp;

    }
    public static int calBinomial(int n,int r){
        int nfac=factorial(n);
        int rfac=factorial(r);
        int nmr=factorial(n-r);
        return(nfac/(rfac*nmr));
    }
    public static void main(String[] args){
        int n=5;
        int r=2;
        System.out.println(calBinomial( n,r));
    }
}
