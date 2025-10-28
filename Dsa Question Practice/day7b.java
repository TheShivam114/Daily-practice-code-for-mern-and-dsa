//Remove duplicates from sorted array

public class day7b {
    public static void main(String[] args){
     int[] arr={1,1,2,2,3,4,4,5,5,6};
     int j=0;
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=arr[i+1]){
            arr[j]=arr[i];
            j++;
        }
     }
     arr[j]=arr[arr.length-1];
     j++;
     System.out.println("Array after removing duplicates:");
     for(int i=0;i<j;i++){
        System.out.print(arr[i]+" ");
     }
    }
}
