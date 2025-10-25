
public class callByValue {
    public static void swap(int a,int b){//here a,b are copy of actual parameter not the real value and its scope is only to this swap functio.
            int temp;
            temp=a;
            a=b;
            b=temp;
            // System.out.println(a+" "+b);

    }
    public static void main(String[] args){
        int a=5;
        int b=6;
        swap(a,b);
        System.out.println(a+" "+b);   //its give a=5;b=6 not the swap number because of call stack
    }
}

//in java its always call by value beacuse it pass only copy of original value.
