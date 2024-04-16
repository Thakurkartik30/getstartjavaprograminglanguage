
import java .util.* ;
public class LL2 {
Node head ; 
     class Node{ 
         String  data ;
         Node next ; 
         Node( String data) {
             this.data = data ;
             this .next = null ;
         } 
        
    }
    // how to reverse a linkedlist
    public  void reverseIterate(){
       //  if (head == null || head.next == null) {
         //    return;
         //}
        Node prevNode = head ;
         Node currNode = head.next ;
         while (head.next != null) {
             Node nextNode = currNode.next ;
             currNode.next = prevNode;
             // update
             prevNode = currNode ;
             currNode = nextNode ;
         }
         head.next = null;
         head = prevNode;
    }

    public Node reverseRecursive(Node head) {
         if (head == null || head.next == null){
             return  head ;
         }
         Node newHead = reverseRecursive(head.next);
         head.next.next  = head ;
         head.next = null ;

         return newHead;
    }
    
    public static void main(String[] args) {
      // LinkedList<String> list = new LinkedList<String>();

       // list.addFirst("a");
       // list.addFirst("is");
       // System.out.println(list);

     //   list.addFirst("This");
     //   list.addLast("list");
     //   System.out.println(list);

       // System.out.println(list.size());

      //  for (int i = 0; i < list.size(); i++) {
        //    System.out.print(list.get(i) + " ->");
      //  }

       // System.out.println(" null ");

       // list.removeFirst();
       // list.remove(3) ;
       // System.out.println(list);

        LL  list = new LL();

        list.addlast("1");
        list.addlast("2");
        list.addlast("3") ;
        list.addlast("4");
        list.printlist() ;

        reverseIterate,.


      //reverseRecrusive(list. head );
       list.printlist();






    }


}
