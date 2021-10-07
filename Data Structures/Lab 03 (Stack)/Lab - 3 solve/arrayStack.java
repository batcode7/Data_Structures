public class arrayStack implements stack {
     char [] a ;
     int size ;
     
     public arrayStack(String b) {
          a = new  char[b.length()] ;
          size = 0 ;
     }
     
     public void push (char e) {
          
               a[size] = e ;
               size++ ;
          
     }
     
     public char pop() {
          char value = a[size - 1] ;
               a[size - 1] = 0 ;
               size-- ;
               return value ;
          }
     
     
     public char peek() {
         char value = a[size - 1] ;
               return value ;
          }
     public boolean empty () {
          if ( size == 0 ) {
               return true ;
          }else {
               return false ;
          }
     }
}