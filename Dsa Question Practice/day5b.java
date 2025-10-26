//  Check if array is sorted 
 
public class day5b {
    public static boolean issorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return issorted(arr, index + 1);
    }
 
    public static void sortArray(int[] arr, int index) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index] > arr[j]) {

                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
        
        sortArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; 
        int[] arr2 = { 1, 3, 2, 4, 7 };
        // System.out.println(issorted(arr, 0));
        System.out.println(issorted(arr2, 0));
        sortArray(arr2, 0);
        
    }    

}
