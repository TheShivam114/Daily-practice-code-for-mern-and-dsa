// import java.lang.Integer;
public class remove_firstAndLast {
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

     public void addFirst(int data){
      
      node newnode=new node(data);
      size++;
      if(head==null){
        head=tail=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
     }

     public void addLast(int data){
      node newnode=new node(data);
      size++;
      if(head==null){
        head=tail=newnode;
        return;
      }
      tail.next=newnode;
      newnode=tail;

     }

     public void Addmidd(int data,int idx){
      node newnode=new node(data);
      if(idx==0){
        addFirst(data);
        return;
      }
      size++;
      node temp=head;
      int i=0;
      while (i<idx-1) {
        temp=temp.next;
        i++;
      }
      newnode.next=temp.next;
      temp.next=newnode;
     }

     public int removeFirst(){
       if(size==0){
          System.out.println("list is empty");
          return Integer.MIN_VALUE;
       }else if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
       }
       int val=head.data;
       head=head.next;
       size--;
       return val;
     }
     
     public int removeLast(){
      if(size==0){
        System.out.println("empty");
        return Integer.MIN_VALUE;
      }else if(size==1){
         int val=tail.data;
         head=tail=null;
         size--;
         return val;
      }
      node prev=head;
      for(int i=0;i<size-2;i++){
        prev=prev.next;
      }
      int val=prev.next.data;
       prev.next=null;
       tail=prev;
       size--;
       return val; 
     }


     public void print(){
      if(head==null){
        System.out.println("ll is empty");
      }
     node temp=head;
     while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
     }
     System.out.println("null");
      
     }
     public static void main(String[] args){
          remove_firstAndLast ll=new remove_firstAndLast();
          ll.addFirst(1);
          ll.addLast(2);
          ll.print();
          // ll.removeLast();
          ll.removeFirst();
          ll.print();
     }

}