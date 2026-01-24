public class search_recursive {
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
       node newnode=new node(data);
          if(head==null){
            head=tail=newnode;
            return;
          }
          newnode.next=head;
         head= newnode;
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

    public void printll(){
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
          search_recursive ll=new search_recursive();
          ll.addFirst(0);
          ll.addLast(1);
          ll.addLast(3);
          ll.printll();
    }
}
