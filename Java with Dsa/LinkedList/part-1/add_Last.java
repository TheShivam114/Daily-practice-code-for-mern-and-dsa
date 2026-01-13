public class add_Last {
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

    // add first
    public void addFirst(int data){
        //create node
        node newnode=new node(data);
         //if link is empty;
         if(head==null){
            head=tail=newnode;
            return ;
         }
           
         newnode.next=head;
         head=newnode;

        }

        //add last
       public void addLast(int data){
        //create node 
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
        }
         
        tail.next=newnode;
        tail=newnode;

       } 
    
    public static void main(String[] args){
       add_Last ll=new add_Last();
       ll.addFirst(0);
       ll.addFirst(1);
       ll.addLast(2);
       ll.addLast(3);
    }
}
