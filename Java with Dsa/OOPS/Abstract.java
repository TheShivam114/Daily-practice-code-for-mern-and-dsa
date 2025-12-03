public class Abstract {
    public static void main(String[] args){
        horse h1 =new horse();
    h1.eat();
    h1.walk();
    h1.changecolor();
    Chicken c1 =new Chicken();
    c1.eat();
    c1.walk();
    System.out.println(c1.color);
// Animal a =new Animal();  //can't create object  

   mustang m =new mustang();
}
}
abstract class Animal{
  void eat(){
    System.out.println("animal eat");
    
  } 

  //constructors
  String color;
  Animal(){
    color="black";
    System.out.println("animal con. call");
  }

  abstract void walk();
}
class horse extends Animal{
    horse(){
        System.out.println("hores con. call");
    }
    void walk(){
        System.out.println("fore leg");
    }
    void changecolor(){
        color="brown";
        System.out.println(color);
    }
}
 
class mustang extends horse{
    mustang(){
        System.out.println("mustang cons. call");
    }
}
class Chicken extends Animal{
     void walk(){
        System.out.println("two legs");
     }
     
     void changecolor() {
         color = "white";
     }
}
/*output :

animal con. call
hores con. call
animal eat
fore leg
brown
animal con. call
animal eat
two legs
black
animal con. call
hores con. call
mustang cons. call
*/