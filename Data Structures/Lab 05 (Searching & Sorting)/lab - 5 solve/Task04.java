public class Task04 {
     public static void main (String [] args) {
          Node head = null ;
          Node n1 = new Node (100 , null) ;
          Node n2 = new Node (0 , null) ;
          Node n3 = new Node (300000 , null) ;
          Node n4 = new Node (0 , null) ;
          n1.next = n2 ;
          n2.next = n3 ;
          n3.next = n4 ;
          n4.next = null ;
          head = n1 ;
          
          for (Node n = recursiveSelectionSort (head , head) ; n != null ; n = n.next) {
               System.out.print (n.element + " ") ;
          }
          System.out.println() ;
     }
     
     public static Node recursiveSelectionSort (Node head , Node p) {
          int temp = 0 ;
          if (p == null) {
               return head ;
          }else {
               for (Node m = p.next ; m != null ; m = m.next) {
                    if (p.element > m.element ) {
                         temp = p.element ;
                         p.element = m.element ;
                         m.element = temp ;
                    }
               }
               return recursiveSelectionSort ( head , p.next  ) ;
           }
     }
}