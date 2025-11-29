public class inheritance {
    public static void main(String[] args){
           fish shark =new fish();
           shark.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}
