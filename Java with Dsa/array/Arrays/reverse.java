public class reverse {
    public static void rev(int number[]){
        int start=0;
        int last=number.length-1;
        while (start<last) {
            int temp=number[start];
            number[start]=number[last];
            number[last]=temp;
            start++;
            last--;
        }

    }
    public static void main(String[] args){
        int arr[]={10,2,5,4,9};
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
