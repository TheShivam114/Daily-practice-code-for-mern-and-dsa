public class stockBuySell {
    public static int stock(int price[]){
        int bystock=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<price.length;i++){
            if(bystock<price[i]){
                int profit=price[i]-bystock;
                max=Math.max(max, profit);
            }
            else{
                bystock=price[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={7,1,5,6,4};
        stock(arr);
    }
}
