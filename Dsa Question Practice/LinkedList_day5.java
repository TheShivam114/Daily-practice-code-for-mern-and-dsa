//add at any where
public class LinkedList_day5 {
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  node head;
    public static node tail;

    public void addFirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addEnd(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;

    }

    public void addAnywhere(int indx,int data){
        if(indx==0){
               addFirst(data);
               return;
        }
        node newnode=new node(data);
        node temp=head;
        int i=0;
        while (i<indx-1) {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
       temp.next=newnode;
    }
    public void print(){
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
         LinkedList_day5 ll=new LinkedList_day5();
         ll.addFirst(1);
         ll.addFirst(0);
         ll.addEnd(2);
         ll.addAnywhere(1, 9);
         ll.print();

    }
}
