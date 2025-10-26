public class primeInRange {
    public static boolean isprime(int n){
        if(n==2){
            return true;

        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void checkRange(int a){
        if(a==1){
            System.out.println("not prime");
        }
        for(int i=2;i<=a;i++){
        //     boolean store=isprime(i);
        //     if(store==true){
        //         System.out.println(i);
        //     }
        

        if(isprime(i)==true){
            System.out.println(i);
        }
    }
    }
    public static void main(String[] args){
        checkRange(20);
    }
}