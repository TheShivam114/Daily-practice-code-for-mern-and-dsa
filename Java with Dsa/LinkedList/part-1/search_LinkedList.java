public class search_LinkedList {
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
    
    public void AddFist(int data){
        node newnode=new node(data);
       if(head==null){
          head=tail=newnode;
          return ;
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
     public void addMid(int data,int index){
        
        if(index==0){
          AddFist(data);
          return;
        }
        node newnode=new node(data);
        node temp=head;
        int i=0;
        while (i<index-1 &&temp != null) {
            temp=temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newnode.next=temp.next;
       temp.next= newnode;

     }

     public int removefirst(){
          if()
     }
    public static void main(String[] arga){
         search_LinkedList ll=new search_LinkedList();
        
             ll.addLast(0);
             ll.addLast(2);
             ll.addLast(3);
             ll.print();  
             ll.addMid(10,5);
             ll.print();
    }
}
