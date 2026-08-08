/*
 You are given an integer array arr[] of size n.
Your task is to sort the array in ascending order using the Insertion Sort algorithm.

Requirements:

Implement Insertion Sort to arrange the array in increasing order.

Print the array after sorting.

Also print the number of shifts (i.e., how many times elements were moved to the right).

Optimize your code so that it stops early if the array becomes sorted before completing all passes.

arr = [5, 4, 1, 3, 2]

 */
public class soringDay2a {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int pree=i-1;
            while(pree>=0 && arr[pree]>curr ){
                  arr[pree+1]=arr[pree];
                  pree--;
            }
            arr[pree+1]=curr;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
    }
}
