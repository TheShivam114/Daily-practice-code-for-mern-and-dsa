/*which variable(s) can the class person access in the following code?
a.name
b.weight
c.rollNumber
d.schoolName
*/
public class q2 {
 public static void main(String[] args){
     student s1=new student();
 }
}
class person{
    String name;
    int weight;

}
class Student extends person{
    int rollNumber;
    String schoolName;
}