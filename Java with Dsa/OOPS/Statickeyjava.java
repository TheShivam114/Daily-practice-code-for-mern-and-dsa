public class Statickeyjava {
    public static void main(String[] args){
         student s1=new student();
         s1.schoolName="shs";
         student s2=new student();
          System.out.println(s2.schoolName);
         student s3=new student();
         s3.schoolName="abc";
         //System.out.println(s2.schoolName);
    }
}
class student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

}
