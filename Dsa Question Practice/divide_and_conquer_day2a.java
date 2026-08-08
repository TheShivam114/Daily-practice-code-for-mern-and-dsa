/*Quick Sort Using Divide and Conquer
Problem Statement
Quick Sort is an efficient sorting algorithm based on the Divide and Conquer paradigm.
Given an array of n integers, write a program to sort the array in ascending order using the Quick Sort algorithm.

Requirements
Implement Quick Sort using recursion.
Use a partitioning technique to place the pivot element at its correct position.
Ensure that all elements smaller than the pivot are placed to its left and all greater elements to its right.
Do not use any built-in sorting functions.

Input
n = 7  
arr = [10, 7, 8, 9, 1, 5]

Output
Sorted Array: [1, 5, 7, 8, 9, 10]
 */
public class divide_and_conquer_day2a {
    public static void quickSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //last element
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left
        quickSort(arr, pIdx+1, ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//jagha banae key liye
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
      
   public static void main(String[] args){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
   } 
}