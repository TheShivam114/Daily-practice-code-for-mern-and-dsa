//Number of even and odd elements

public class day8a {
    public static void evenOdd(int numbers[]){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Number of even elements: "+evenCount);
        System.out.println("Number of odd elements: "+oddCount);
    }
}
