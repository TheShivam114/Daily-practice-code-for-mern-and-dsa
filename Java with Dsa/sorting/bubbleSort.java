public class bubbleSort {
    public static void bubble(int arr[]){
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,arr[i]);
        // }
        
        // System.out.println(max);
        for(int turn=0;turn<n-1;turn++){
          for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
          }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        bubble(arr);
    }
}
