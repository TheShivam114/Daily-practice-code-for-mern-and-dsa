/*Write a recursive function isSorted(int arr[], int n) to determine whether a given array of size n is sorted in strictly increasing order.
The function should return:

true → if the array is sorted

false → if any element is smaller than or equal to its previous element

You must use recursion only (no loops allowed).

Check your function for the following input:

arr = {2, 5, 9, 12, 18}
 */
public class recursion_day3b {
    public static boolean shortAcc(int arr[] ,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
         return shortAcc(arr, i+1);
    }
    public static void main(String[] args){

       int arr[]={1,2,3,4,5};
       System.out.println(shortAcc(arr, 0));
    }
}
