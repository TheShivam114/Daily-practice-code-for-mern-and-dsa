
public class shalo_deepCopy_constructor {
    public static void main(String[] args){
        student s1 =new student();
        s1.name="shivam";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        student s2=new student(s1);
        s1.marks[2] = 80;
        s2.name="shivam kumar";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}
class student{
    String name;
    int marks [];
    student(){
      marks=new int[3];
     
    }
    //shallow copy constructer;

    /* student(student s1){
         marks = new int[3];
         this.name=s1.name;

     }*/

    //deep copy constructor

    student(student s1){
        marks = new int[3];
        this.name=s1.name;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

     
}
