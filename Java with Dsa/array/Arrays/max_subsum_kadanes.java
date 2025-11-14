public class max_subsum_kadanes {
    public static void kadanes(int arr[]){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
            if(count<0){
                count=0;
            }
            max=Math.max(count,max);
        }
        System.out.println("max: "+max);
    }
    public static void main(String[] args){
       int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}