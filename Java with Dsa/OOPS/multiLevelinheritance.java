public class multiLevelinheritance {
    public static void main(String[] args){
       dog dogges =new dog();
       dogges.eat();
       dogges.legs=5;
       System.out.println(dogges.legs);
    }
}
class Animal{
  String color;
  void eat(){
    System.out.println("eat");
  }
}
class mammels extends Animal{
 int legs;
}
class dog extends mammels{
 String bark;
}

