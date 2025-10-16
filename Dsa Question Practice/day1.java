/*Given an integer array nums, return true if any value appears more than once in the array,
 otherwise return false.
ex-1
 Input: nums = [1, 2, 3, 3]
Output: true
ex-2
Input: nums = [1, 2, 3, 4]
Output: false
*/
class day1{
    public boolean y(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]==num[j]){
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args){
       day1 x =new day1();
       int[] num1={1,2,3,4};
       int[] num2={1,2,2,3};
       System.out.println(x.y(num1)) ;
       boolean a= x.y(num2);
       System.out.println(a);
        
    }
}
