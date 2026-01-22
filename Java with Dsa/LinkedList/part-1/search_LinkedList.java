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
        if(head==null){
            head=tail=null;
            return;
        }
        
    }

    public static void main(String[] arga){

    }
}
