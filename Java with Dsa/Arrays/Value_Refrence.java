public class Value_Refrence {
    public static void update(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        n=10;
    }
    public static void main(String[] args){
        int arr[]={30,40,50};
        int n=6;
        update(arr,n);
          System.out.println(n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
