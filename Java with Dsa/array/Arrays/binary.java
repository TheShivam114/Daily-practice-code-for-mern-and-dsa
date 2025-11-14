import java.util.Arrays;
public class binary {
public static int binarysearch(int arr[],int key){
      Arrays.sort(arr);
      System.out.print("after shorting: ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    int st=0;
    int end=arr.length-1;

    while(st<=end){
        int mid=(st+end)/2;
        // System.out.println(mid);
        if(key>arr[mid]){
            st=mid+1;
            
        }
        else if(key<arr[mid]){
              end=mid-1;
        }
        else{
            return mid;
        }

    }
    return -1;

}
    public static void main(String[] args){
        int arr[]={2,5,7,9,12,8};
       int key=8;

       int result=binarysearch(arr,key);
       if(result==-1){
        System.out.println("not found");
       }
       else
       {
        System.out.println(", found at: "+result);
       }
    }
}
