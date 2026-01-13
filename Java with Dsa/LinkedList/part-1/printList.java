public class printList {
    public class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        } 
    }
public static node head;
public static node tail;

public void addFirst(int data){
      node newnode= new node(data);
      if(head==null){
        head=tail= newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
}

public void addLast(int data){
    node newnode=new node(data);
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
}

public void print(){
    if(head==null){
        System.out.println("ll is empty");
        return;
    }
    node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");

}

    public static void main(String[] args){
    printList ll=new printList();
    ll.addFirst(0);
    ll.print();
    ll.addFirst(1);
    ll.print();

    }
}
