public class hybrid_inheritance {
    public static void main(String[] args){
           mammals m1=new mammals();
           m1.eye=2;
           m1.eye();
           
    }
}
class animal{
    int eye;
    void eye(){
        System.out.println(eye);
    }
}
class fish extends animal{
       void swim(){
        System.out.println("swim");
       }
}
class Bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}
class mammals extends animal{
    void walk(){
        System.out.println("walk");
    }
}

class tuna extends fish{
     void small(){
        System.out.println("small fish");
     }
}
class shark extends fish{
       void big(){
        System.out.println("big fish");
       }
}

class peacock extends Bird{
     void beautyfull(){
        System.out.println("so beautyfull");
     }
}
class dog extends mammals{
    void bark(){
        System.out.println("bark");
    }
}

