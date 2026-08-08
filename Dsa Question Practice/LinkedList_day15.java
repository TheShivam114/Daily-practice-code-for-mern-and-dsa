public class LinkedList_day15 {
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
            head=tail=newnode;
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

    public void zigzag(){
        //find mid
        node slow=head;
        node fast=head.next;
        while(fast!=null&& fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
        }
        node mid=slow;

        //reverse 2nd half
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;
        node nextl,nextr;

        //alt merg-zig-zag merge;
        while(left!=null&&right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;

        }
    }
    public void print(){
       if(head==null){
        System.out.println(" ll is null ");
       }
       node temp=head;
       while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
       System.out.println("null");
    }
    public static void main(String[] args){
         LinkedList_day15 ll=new LinkedList_day15();
         ll.addFirst(1);
         ll.addLast(2);
         ll.addLast(3);
         ll.addLast(4);
         ll.print();
         ll.zigzag();
         ll.print();
    }
}