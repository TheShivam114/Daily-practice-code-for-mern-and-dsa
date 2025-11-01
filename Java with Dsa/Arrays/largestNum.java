import java.util.*;
public class largestNum {
    public static int getlargest(int arr[]){
        int larger=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(larger<arr[i]){
                larger=arr[i];
            }

        }
        return larger;
    }
    public static void main(String[] args){
        int arr[]={2,1,6,3,5};
        System.out.println("largest array: "+getlargest(arr));

    }
}

    

