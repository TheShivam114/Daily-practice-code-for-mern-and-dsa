/*
     Best time to Buy and sell stock
 **************************************
 You are given an array prices where prices[i] is the price of a given stock on the ith day.
  You want to maximize your profit by choosing a single day to buy one stock and choosing a 
  different day in the future to sell that stock. Return the maximum profit you can achieve from 
  this transaction. If you cannot achieve any profit, return 0.

  price=[7,1,5,3,6,4]

 */
public class day16a {
    public static int stock(int price[]){
        int byStock=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<price.length;i++){
              if(byStock<price[i]){
                int profit=price[i]-byStock;
                max=Math.max(max,profit);
              }
              else{
                byStock=price[i];
              }
        }
        if(max>0){
            return max;
        }
        else{
            return 0;
        }
    }
     public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int arr2[]={5,4,3,2,1};
        
        System.out.println("maximum profit "+stock(arr));
        // System.out.println("maximum profit " + stock(arr2));
     }
}
