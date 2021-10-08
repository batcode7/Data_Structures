public class Task03 {
     public static void main (String [] args) {
          Node head = null ;
          Node n1 = new Node (100 , null) ;
          Node n2 = new Node (40 , null) ;
          Node n3 = new Node (300000 , null) ;
          Node n4 = new Node (3 , null) ;
          n1.next = n2 ;
          n2.next = n3 ;
          n3.next = n4 ;
          n4.next = null ;
          head = n1 ;
          
          for (Node n = recursiveBubbleSort (head , head) ; n != null ; n = n.next) {
               System.out.print (n.element + " ") ;
          }
          System.out.println() ;
     }
     
     public static Node recursiveBubbleSort (Node head , Node p) {
          int temp = 0 ;
          if (p == null) {
               return head ;
          }else {
               for (Node m = head ; m.next != null ; m = m.next) {
                    if (m.element > (m.next).element ) {
                         temp = m.element ;
                         m.element = m.next.element ;
                        m.next.element = temp ;
                    }
               }
               return recursiveBubbleSort ( head , p.next  ) ;
           }
     }
}