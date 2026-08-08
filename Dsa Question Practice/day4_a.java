// Find the minimum and maximum element in an array
public class day4_a {
    public static void main(String[] args){
        int[] arr={3,5,7,2,8,1,4};
        
        int j=arr[0];
        int k=arr[0];
            //  int temp=;
        for(int i=0;i<arr.length;i++){
           
                if(arr[i]>j){
                    j=arr[i];
                }
               if(arr[i]<k){
                k=arr[i];
               }
            
        }
        System.out.println("the maximum element is :"+j);
        // System.out.println("the minimum element is :"+arr[j]);
        System.out.println("the minimum element is :"+k);

        }
    
}
