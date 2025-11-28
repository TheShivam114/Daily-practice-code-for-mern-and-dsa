public class copyConstructor {
    public static void main(String[] args){
        student s1 = new student();
        s1.name="shivam";
        s1.roll=5;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        student s2 =new student(s1);//copy
        s2.password="xyz";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];
    //copycontructor
     student(student s1){
        marks =new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
     }
     student(){
         marks = new int[3];
        System.out.println("student name");
     }
     student(String name){
         marks = new int[3];
         this.name=name;
     }
     student(int roll){
         marks = new int[3];
         this.roll=roll;
     }
}
