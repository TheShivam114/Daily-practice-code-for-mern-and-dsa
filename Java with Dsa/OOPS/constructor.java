/*public class constructor {
    public static void main(String[] args){
       student s1=new student();

    }
}
class student{
    String name;
    int rollno;
       student(){
        System.out.println("hi");
       }
}*/
public class constructor {
    public static void main(String[] args) {
        student s1 = new student("shivam");
        System.out.println(s1.name);

    }
}

class student {
    String name;
    int rollno;

    student(String name) {
         this.name=name;
    }
}