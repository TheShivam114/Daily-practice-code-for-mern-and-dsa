public class palendrome {
    public static boolean palendromeCode(String st){
        for(int i=0;i<st.length()/2;i++){
            int n=st.length();
            if(st.charAt(i)!=st.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String st="racecar";
       System.out.println("value is :"+palendromeCode(st)) ;
    }
}
