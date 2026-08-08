/*(Merge Sort) 
Problem Statement:
Given an integer array arr of size n, write a program to sort the array in ascending order using the Merge Sort algorithm.
The algorithm should work as follows:
Divide the array into two halves until each subarray contains only one element.
Conquer by recursively sorting the subarrays.
Combine the sorted subarrays to produce the final sorted array.
 Input Format:
An integer n representing the size of the array
n space-separated integers representing the elements of the array
 Output Format:
Print the sorted array in ascending order
 Constraints:

1 ≤ n ≤ 10^5
-10^9 ≤ arr[i]≤ 10^9
 Example:
Input:
6
5 2 9 1 3 6
Output:
1 2 3 5 6 9 */
public class div_and_conq_day1a {
    public static void mergeSort(int arr[],int si,int ei){
        //basecase
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//(si+ei)/2
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);//code for merging
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int tmp[]=new int[ei-si+1];//left(0,3)=4 right(4,6)=3 => 6-0+1 ;
        int i=si;//iterator for left part
        int j=mid+1;//iterator of right part
        int k=0;
        while(i<=mid &&j<=ei ){
            if(arr[i]<arr[j]){
                tmp[k]=arr[i];
                i++;
            }
            else{
                tmp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for lefttoner element of 1st sort part
        while (i<=mid) {
            tmp[k++]=arr[i++];
            
        }
        //right part
        while(j<=ei){
            tmp[k++]=arr[j++];
        }
        //copy to original arr
        for(k=0,i=si;k<tmp.length;k++,i++){
            arr[i]=tmp[k];
        }

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
}
