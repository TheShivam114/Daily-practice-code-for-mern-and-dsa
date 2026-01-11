public class add_first {
    public static class node{
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
        //step-1 create new node
        node newNode=new node(data);
        //if node is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step-2 newNode next=node;
        newNode.next=head;
        //step-3 head=newNode
        head=newNode;

        
    }
    public static void main(String[] args){
       add_first ll=new add_first();
       ll.addFirst(1);
       ll.addFirst(2);
    } 
}
