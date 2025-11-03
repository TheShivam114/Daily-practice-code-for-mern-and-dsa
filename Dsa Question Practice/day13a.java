//Write a Java program to print all subarrays of a given array.
/*int arr[] = {2, 4, 6};

2
2 4
2 4 6
4
4 6
6
Total subarrays: 6

 */
public class day13a {
    public static void subarray(int arr[]){
     for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i; j<arr.length;j++){
        int end =j;
        for(int k=start;k<=end;k++){
            
            System.out.print(arr[k]+" " );
            

        }
        System.out.println();
        }
        System.out.println();
     }
    }
    
    public static void main(String[] args){
        int arr[]={2, 4, 6, 8, 10};
        subarray(arr);
    }
}
