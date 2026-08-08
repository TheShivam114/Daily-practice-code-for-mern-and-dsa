/*Count frequency of each element in an array
arr = {2, 3, 2, 5, 3, 2}
output:
2 → appears 3 times
3 → appears 2 times
5 → appears 1 time

 */ 
public class day4 {
    public static void main(String[] args){
      int[] arr={2, 3, 2, 5, 3, 2};
      int n=arr.length;
    //   System.out.println(n);
      boolean[] check=new boolean[n];
      for(int i=0;i<n;i++){
        int count=1;
        if(check[i]==true){
            continue;
        }
        for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                count++;
                check[j]=true;
              }
        }
        System.out.println(arr[i]+"->"+"appeare"+count+"time");
      }
        


           
    }
   

}
