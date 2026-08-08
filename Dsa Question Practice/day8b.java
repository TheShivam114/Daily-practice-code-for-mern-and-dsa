//Two Sum (pair sum equals target)
//nums = [2, 7, 11, 15], target = 9

public class day8b {
    public static void twoSum(int numbers[], int target){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    System.out.println("Pair found at index: "+i+" and "+j);
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args){
        int numbers[]={2, 7, 11, 15};
        int target=9;
        twoSum(numbers, target);
    }
}
