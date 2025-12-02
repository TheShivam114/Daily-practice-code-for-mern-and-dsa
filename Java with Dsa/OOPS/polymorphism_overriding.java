public class polymorphism_overriding {
    public static void main(String[] args){
          Deer d1 =new Deer();
          d1.eat();
    }
}
class Animal{
 void eat(){
    System.out.println("eat anythings");
 }
}
class Deer extends Animal{
void eat(){
    System.out.println("eat grass");
}
}
