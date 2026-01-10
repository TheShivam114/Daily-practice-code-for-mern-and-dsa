public class create_head_tail {
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
    

    public static void main(String[] args){
         create_head_tail ll=new create_head_tail();
           ll.head = new node(0);
            ll.head.next =new node(2);
    }
    
}