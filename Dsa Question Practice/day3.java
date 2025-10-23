/*Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]*/
public class day3 {
      public static void add(int[] arr1,int target1 ){
             for(int i=0;i<arr1.length;i++)
             {
                for(int j=0;j<=i;j++)
                {
                    if((arr1[i]+arr1[j])==target1){
                       System.out.println("index"+i+","+j);
                    }
                    // else{
                    //     System.out.println("not possible");
                    // }

                }
             }
      }
    public static void main(String[] args)
    {
        int[] arr=new int[] {4,5,6};
        int target=10;
        add(arr,target);


        
    }
}