public class sizeOfList {
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
   public static int size;

   public void add_first(int data){
      
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
   }

   public void add_end(int data){
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;

    }
    tail.next=newnode;
    tail=newnode;
   }

   public void print() {
       if (head == null) {
           System.out.println("ll is empty");
           return;
       }
       node temp = head;
       while (temp != null) {
           System.out.print(temp.data + "->");
           temp = temp.next;
       }
       System.out.println("null");

   }

   public void add_anyWhere(int data,int index){
    if(index==0){
       add_first(data);
       return;
    }
      node newnode=new node(data);
      size++;
      node temp=head;
      int i=0;
      while(i<index-1){
        temp=temp.next;
        i++;
      }
      newnode.next=temp.next;
      temp.next=newnode;
   }
    public static void main(String[] args){
         sizeOfList ll=new sizeOfList();
         ll.add_anyWhere(2, 0);
         ll.print();
         System.out.println(ll.size);
    }
}
