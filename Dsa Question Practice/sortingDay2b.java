/*
 Question: Counting Sort (Positive Numbers Only)

You are given an integer array arr[] of size n containing only non-negative integers.
Your task is to sort the array in ascending order using the Counting Sort algorithm.

arr = {5, 4, 1, 3, 2}

arr={1,4,1,3,2,4,3,7}
 */

public class sortingDay2b {
       public static void countingSort(int arr[]){
        int larger=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            larger=Math.max(larger, arr[i]);
        }
        int count[]=new int[larger+1];
        for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
        }
        //swapcode
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
             j++;
             count[i]--;
            }
             
        }
        //print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        int arr2[]={1,4,1,3,2,4,3,7};
        countingSort(arr2);
        countingSort(arr);
    }
}
