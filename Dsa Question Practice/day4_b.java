// Search an element in an array (Linear Search)
public class day4_b {
    public static void main(String[] args){
        int[] arr={4,6,2,8,1,9,3};
        int a=8;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("the element is found at index :"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("the element is not found in the array");
        }
    }                                                                               
}
