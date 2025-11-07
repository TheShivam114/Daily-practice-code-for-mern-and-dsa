/*
 You are given an integer array arr[] of size n.
Your task is to sort the array in ascending order using the Selection Sort algorithm.

Requirements:

Implement the Selection Sort algorithm using nested loops.

After sorting, print the elements of the sorted array.

Also print the total number of passes (or selections) performed.

Optimize your logic so that unnecessary swaps are avoided if the smallest element is already in its correct position.

arr = [5, 4, 1, 3, 2]
Sorted Array: 1 2 3 4 5
Total Passes: 4

 */
public class shortingb {
    public static void selectionShort(int arr[]){
        int passes=0;
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            passes++;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int tmp=arr[min];
            arr[min]=arr[i];
            arr[i]=tmp;
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal Passes: " + passes);
    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        selectionShort(arr);
    }
}
