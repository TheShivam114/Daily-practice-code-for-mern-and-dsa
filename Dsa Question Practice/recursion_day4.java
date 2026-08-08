/*Given an integer array

arr = {8, 3, 6, 9, 5, 10, 2, 5, 3}


Write a recursive function firstOccurrence(int arr[], int index, int key) that returns the index of the first occurrence of the given element key in the array.

The function should start searching from index = 0

If the element is found, return its index

If the element does not exist in the array, return -1

Do not use loops

(a) Find the first occurrence of key = 5
(b) Find the first occurrence of key = 3
 */
public class recursion_day4 {
    public static int findOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return findOccur(arr, key, i+1);

    }
    public static void main(String[] args){
        int arr[]={8, 3, 6, 9, 5, 10, 2, 5, 3};
          System.out.println(findOccur(arr,5,0));
          System.out.println(findOccur(arr,3,0));
    }
}
