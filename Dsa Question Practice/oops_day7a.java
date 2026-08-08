/*Create two interfaces:

interface Printable { void print(); }
interface Showable { void show(); }


Create a class Document that implements both interfaces and provides messages inside both methods.

In main, create a Document object and call both methods. */

    interface Printable {
        void print();
    }

    interface Showable {
        void show();
    }

    class Document implements Printable, Showable {

        public void print() {
            System.out.println("Printing the document...");
        }

        public void show() {
            System.out.println("Showing the document...");
        }
    }

    public class oops_day7a
     {
        public static void main(String[] args) {
            Document doc = new Document();

            doc.print();
            doc.show();
        }
    }
  

