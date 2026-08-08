// Reverse the array
public class day4b {
   public static void main(String[] args){
    int[] arr={3,5,2,8,1};
    int n=arr.length;
    int left;
    int right=n-1;
    for(left=0;left<right;left++){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        // left++;
        right--;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
   }
}
