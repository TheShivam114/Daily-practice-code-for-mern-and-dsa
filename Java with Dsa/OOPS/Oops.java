/*object: is an entities in the real world
 class: group  of these entities 
              or
   collection of similar property of object and group them 
             or
  class is nothing blue print of an object;
  class have there attribute means(property) or function(behaviors)            
*/

public class Oops {

public static void main(String[] args){
     Pen p1=new Pen();
     p1.setColor("yello"); 
     System.out.println(p1.color);
     p1.setTip(5);
     System.out.println(p1.tip);
    
      p1.color="blue";
      System.out.println(p1.color);

}

}
class Pen{
  String color;
  int tip;

  void setColor(String newcolor)
  {
    color=newcolor;
  }
  void setTip(int newTip){
    tip=newTip;
  }
}
class Student{

}
