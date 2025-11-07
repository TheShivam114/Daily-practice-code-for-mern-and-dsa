/*
 You are given an integer array arr[] of size n.
Your task is to sort the array in ascending order using the Bubble Sort algorithm.
arr = [5, 4, 1, 3, 2]

Sorted Array: 1 2 3 4 5
Total Passes: 4


Requirements:

Implement the Bubble Sort algorithm using nested loops.

After sorting, print the elements of the array.

Optimize your code so that if the array is already sorted, it should stop early (to achieve O(n) in the best case).

Finally, print the total number of passes required to sort the array.
 */
public class shortinga {
    public static void bubbleShort(int arr[]){
        int passes=0;
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            passes++;
          for(int j=0;j>arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                     int tmp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=tmp;
                     swap++;
            }
          }
          if(passes<0){
              break;
          }
        }
        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nTotal Passes: "+passes);

    }
    public static void main(String[] args){

        int arr[]={5,4,1,3,2};
        bubbleShort(arr);
    }
}
