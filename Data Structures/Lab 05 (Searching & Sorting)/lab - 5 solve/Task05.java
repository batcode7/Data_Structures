public class Task05 {
     public static void main (String [] args) {
          dNode head = null ;
          dNode n1 = new dNode (100000000 , null ,null) ;
          dNode n2 = new dNode (20000000 , null , null) ;
          dNode n3 = new dNode (3000000 , null , null) ;
          dNode n4 = new dNode (400000 , null , null) ;
          n1.prev = null ;
          n1.next = n2 ;
          n2.prev = n1 ;
          n2.next = n3 ;
          n3.prev = n2 ;
          n3.next = n4 ;
          n4.prev = n3 ;
          n4.next = null ;
          head = n1 ;
          
          for (dNode n = recursiveInsertionSort (head , head.next) ; n != null ; n = n.next) {
               System.out.print (n.element + " ") ;
          }
          System.out.println() ;
     }
     
     public static dNode recursiveInsertionSort (dNode head , dNode p) {
          int temp = 0 ;
          if (p == null) {
               return head ;
          }else {
               for (dNode m = head ; m != p ; m = m.next) {
                    if (p.element < m.element ) {
                         temp = p.element ;
                         p.element = m.element ;
                         m.element = temp ;
                    }
               }
               return recursiveInsertionSort ( head , p.next  ) ;
           }
     }
}