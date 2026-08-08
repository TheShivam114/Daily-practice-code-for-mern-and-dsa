//check if Linked List is a palindrome or not
public class LinkedList_day10 {
        public class node {
            int data;
            node next;

            public node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static node head;
        public static node tail;
        public static int size;

        public void add_first(int data) {

            node newnode = new node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public void add_end(int data) {
            node newnode = new node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;

            }
            tail.next = newnode;
            tail = newnode;
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

        public void add_anyWhere(int data, int index) {
            if (index == 0) {
                add_first(data);
                return;
            }
            node newnode = new node(data);
            size++;
            node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

        public node findMid(node head){
            node slow=head;
            node fast=head;
            while(fast!=null && fast.next!=null){
                 slow=slow.next;
                 fast=fast.next.next;
            }
            return slow;
        }
         public boolean checkPalindrome(){
            if(head==null||head.next==null){
                  return true;
            }
            //step-1 - find mid
            node midnode=findMid(head);
            //step-2 - reverse 2nd half
            node prev=null;
            node curr=midnode;
            node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            node right=prev;//right half next;
            node left=head;
            //step-3 -check left half=right half
            while (right!=null) {
             if(left.data!=right.data){
                return false;
             }
             left=left.next;
             right=right.next;
                
            }
             return true;
         }
        public static void main(String[] args) {
            LinkedList_day10 ll= new LinkedList_day10();

          ll.add_end(1);
          ll.add_end(2);
          ll.add_end(2);
          ll.add_end(1);
            ll.print();
            System.out.println(ll.checkPalindrome());
            System.out.println(ll.size);
        }
    }


