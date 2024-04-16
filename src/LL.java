public class LL {
    Node head ;
    private int sije ;
     LL() {
         this.sije = 0 ;
     }
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            sije ++ ;
        }
    }


    // ADD - first ,last
    public void addfirst (String data) {

        Node newNode = new Node(data) ;

        if(head == null) {
            head = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;

        

    }

    // add last
    public void addlast (String data) {
        Node newNode = new Node(data) ;
        if (head == null) {
            head = newNode;
            return ;
        }

        Node currNode = head ;
        while (currNode .next != null) {
            currNode = currNode.next ;

        }
        currNode.next = newNode;
    }

    // print
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return ;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        sije -- ;
        head = head.next;

    }
     // delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        sije -- ;
        if (head.next == null) {
            head = null ;
            return;
        }
        Node secondlast = head ;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next ;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsije() {
         return sije ;
    }
    // how to reverse a linkedlist
    public void reverseIterate(){
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head ;
        Node currNode = head.next ;
        while (currNode!= null) {
            Node nextNode = currNode.next ;
            currNode.next = prevNode;
            // update
            prevNode = currNode ;
            currNode = nextNode ;
        }
        head.next = null;
        head = prevNode;
    }

     public static void main (String args[]) {
            LL list = new LL() ;

            list.addfirst("a");
            list.addfirst("is");
        //    list.printlist();


            list.addlast("list");
            list.printlist();

            list.addfirst("this");
              list.printlist();


          // list.deleteFirst();
         //   list.printlist();

           // list.deletelast();
        //    list.printlist();

       //  System.out.println(list.getsije() ) ;

         list.addfirst("4");
         list.addfirst("3");
         list.addfirst("2");
         list.addfirst("1");
         list.printlist() ;

         list.reverseIterate();
         list.printlist();




     }


}