/*
 Write a program to perform the following operations on an integer array:

 1.Reverse the array.

 2.Sort the reversed array in ascending order.

 3.Reverse the sorted array again to get it in descending order.

  Finally, print the array after each step

ex-arr = [5, 1, 3, 2, 4] Step 1 – Reverse:[4, 2, 3, 1, 5]  step 2-Sort (ascending):[1, 2, 3, 4, 5] Step 3 – Reverse again :[5, 4, 3, 2, 1]
   
 */

import java.util.Arrays;

public class day10b {
    public static void result(int arr[]){
        //given array
        System.out.println("given array");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
       
        //reverse
        int end=arr.length-1;
        int s=0;
        while (s<end) {
            
        
            int temp=arr[s];
            arr[s]=arr[end];
            arr[end]=temp;
            end--;
            s++;
        }
        System.out.print("after reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        //short
        //    Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
           System.out.print("after sort:");
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        //reverse again
         end=arr.length-1;
         s=0;
           
        while (s < end) {
            int temp = arr[s];
            arr[s] = arr[end];
            arr[end] = temp;
            s++;
            end--;
        }
         System.out.print("after reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void main(String[] args){
        int arr[]={5,1,3,2,4};
         result(arr);
         
    }
}
