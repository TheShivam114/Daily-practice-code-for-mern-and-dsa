public class typeOfConstructor {
    //non-parameterized constructor
    //parameterized constructor
    //copy constructor
    public static void main(String[] args){
        student s1=new student();
        student s2=new student("shivam");
        student s3=new student(5);
        

    }
   
}
 class student{
        String name;
        int roll;
        student(){
            System.out.println("non-parameterized constructor");
        }
        student(String name){
           this.name=name;
        }
        student(int roll){
            this.roll=roll;
        }
    }