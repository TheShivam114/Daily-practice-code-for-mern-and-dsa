public class get_set {
   public static void main(String[] args){
         pen p1=new pen();

         //for public
         p1.setTip(5);
         System.out.println(p1.tip);

         //for access with private
        p1.setcolor("blue");
        System.out.println(p1.getcolor());


   }
}
class pen{
    private String color;
    int tip ;
    String getcolor(){
       return this.color;
    }
    
    void setcolor(String newcolor) {
        this.color = newcolor;
    }
    void setTip(int newTip){
       this.tip=newTip;
    //    tip=newTip;
    
    }

}
