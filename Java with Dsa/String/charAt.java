
public class charAt {
    public static void printAll(String full){
        for(int i=0;i<full.length();i++){
            System.out.print(full.charAt(i));
        }
    }
    public static void main(String[] args){
        String firstname="shivam";
         String secondname="kumar";
         String full=firstname+" "+secondname;
        //  System.out.println(full.charAt(0));

        String question="123456";
         printAll(full);

    }
    

}
