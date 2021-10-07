public class listStack implements stack {
     Node head ;
     
     public void push (char e) {
          Node n = new Node (e , head) ;
          head = n ;
          
     }
     
     public char pop() {
          Node remove = head ;
          head = head.next ;
          remove.next = null ;
          return remove.element ;
     }
     
     
     public char peek() {
          return head.element ;
     }
     
     public boolean empty () {
          if ( head == null ) {
               return true ;
          }else {
               return false ;
          }
     }
     
}