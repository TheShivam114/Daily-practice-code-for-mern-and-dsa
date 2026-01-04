import java.util.ArrayList;
public class operation {
  public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    //add
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(2,5);
    System.out.println(list);
    //get
    int element=list.get(0);
    System.out.println(element);
    System.out.println(list.get(4));
    //remove
    list.remove(2);
    System.out.println("removed element:"+list);
    //set element at index
    list.set(2, 10);
    System.out.println("set element"+list);
    //contain element:-is it exist or not in list 
       System.out.println(list.contains(4));
       System.out.println(list.contains(14));
    // length of arrlist
     System.out.println(list.size());
     //print all arrlist
     for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
     }
  }  
}
