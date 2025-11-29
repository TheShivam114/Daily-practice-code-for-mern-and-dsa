public class hierarchial_inheritance {
    public static void main(String[] args){
            mammals m1 =new mammals();
            m1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Bird extends Animal{
    void fly(){
      System.out.println("fly");
    }
}
class mammals extends Animal{
    void walk(){
        System.err.println("walk");
    }
}
