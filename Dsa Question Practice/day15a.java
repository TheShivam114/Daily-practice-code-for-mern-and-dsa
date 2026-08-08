//trapping Rainwater
/*
 Given n non-nege non-negative integers representing elevation map where the an width of each our is 1,
  compite how much water it can trap after raining

  height = [4, 2, 0,6,3,2,5]


 */
public class day15a {
    public static int trappingRainwater(int height[]){
        int n=height.length;
        //leftmax;
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
         //rightmax;
         int rightmax[]=new int[height.length];
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
         }
         int trappedWater=0;
         for(int i=0;i<n;i++){
            //waterlevel=min(leftmax bound,rightmax bound)
            int waterLevel=Math.min(leftMax[i], rightmax[i]);
            //trapped water= waterlevel-height of bar
            trappedWater= trappedWater+(waterLevel-height[i]);
         }
           return trappedWater;

    }
    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(arr));
        
    }
}
