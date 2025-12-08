public class Supekeyrjava {
    public static void main(String[] args){
        Horse h1=new Horse();
        System.out.println(h1.color);
         
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("four leg");
    }
}
class Horse extends Animal{
    
       Horse(){
        super();
        super.color="brown";
        
        System.out.println("yes");
       }
}
