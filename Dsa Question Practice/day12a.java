//Write a Java program to print all pairs of elements in an array
/*int arr[] = {2, 4, 6, 8, 10};
(2, 4) (2, 6) (2, 8) (2, 10)
(4, 6) (4, 8) (4, 10)
(6, 8) (6, 10)
(8, 10)
Total pairs: 10
 */
public class day12a {
    public static void pairs(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int crr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+crr+","+arr[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " +total);
    }
    
    public static void main(String[] args){
        int arr[]={2, 4, 6, 8, 10};
        pairs(arr);
    }
}
