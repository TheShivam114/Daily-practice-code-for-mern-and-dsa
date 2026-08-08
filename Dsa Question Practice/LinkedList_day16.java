//create doubly ll
// performing addfirst,removefirst and print in dobuly ll
public class LinkedList_day16 {
    public class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
      
    }  
    public static node head;
    public static node tail;
     public static int size;
    //add first

    public void addFirst(int data){
       node newnode=new node(data);
       if(head==null){
             head=tail=newnode;
             return;
       }
       newnode.next=head;
       head.prev=newnode;
       head=newnode;

    }
    //print
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    //remove first
      public int  removefirst(){
        if(head==null){
            System.out.println("dl is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
      }
    public static void main(String[] args){
          LinkedList_day16 ll=new LinkedList_day16();
          ll.addFirst(3);
          ll.addFirst(2);
          ll.addFirst(1);
          ll.addFirst(0);
          ll.print();
          ll.removefirst();
          ll.print();
    }
}
