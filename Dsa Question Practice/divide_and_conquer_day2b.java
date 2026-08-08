/* A sorted array of distinct integers has been rotated at an unknown pivot.
You are given this rotated sorted array arr[] of size n and an integer target.
Write an efficient algorithm to determine the index of the target element in the array.
If the target element is not present, return -1.

Constraints
1 ≤ n ≤ 10⁵
-10⁹ ≤ arr[i] ≤ 10⁹
All elements in the array are distinct
The array was originally sorted in ascending order

Input
arr = [4, 5, 6, 7, 0, 1, 2]
target = 0

Output
Index = 4*/
public class divide_and_conquer_day2b {
    public static int search(int arr[],int tar,int si,int ei){
        //kam
        int mid=si+(ei-si)/2;
        //case found at mid
        if(arr[mid]==tar){
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=tar&&tar<=arr[mid]){
                return search(arr, tar, si, mid);
            }
            else{
                //case b:right
                return search(arr, tar ,mid+1, ei);
            }
        }
        //mid on l2
        else{
               //case c: right
               if(arr[mid]<=tar&& tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
               }
               //case d: left
               else{
                return search(arr, tar, si, mid-1);
               }
        }
    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int a=search(arr,target,0,arr.length-1);
        System.out.println("found element: "+a);
    }
}
