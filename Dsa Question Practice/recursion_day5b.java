/*Given the integer array
arr = {8, 3, 6, 9, 5, 10, 2, 5, 3}
Write a recursive function lastOccurrence(int arr[], int index, int key) that returns the index of the last occurrence of the element key in the array.
Conditions
The search must start from index = 0
Use recursion only (loops are not allowed)

Return the index if the element is found
Return -1 if the element does not exist in the array
Tasks

Find the last occurrence of key = 5
Find the last occurrence of key = 3 */
public class recursion_day5b {
    public static int lastocc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastocc(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
  public static void main(String[] args) {
      int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
     System.out.println(lastocc(arr, 05, 0));
  } 
}
