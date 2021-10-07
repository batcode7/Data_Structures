import java.util.* ;
public class Task00001 {
     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in) ;
          System.out.println ("Please type your expression,Sir") ;
          String expression = scanner.nextLine() ;
          check(expression) ;
     }
     public static boolean check (String a) {
          boolean boo = false ;
          Stack <Character> s = new Stack <Character> () ;  // deplopying a stack naming s
          char[] c = a.toCharArray();  // creating a char type array 
          for (int i = 0 ; i <  c.length ; i++ ) {
               if (c[i]=='('||c[i]=='{'||c[i]=='[' ) { // adding values to stack
                    s.push (c[i]) ;
               }else if (c[i]==')'||c[i]=='}'||c[i]==']') {
                    if (s.empty() == true) { // checking if stack is empty or not
                         System.out.println( "This expression is NOT correct" ) ;
                         System.out.println( "Error at character # " + (i+1) + "." + "'" + c[i] + "'" + "- not opened.") ;
                         return false ;
                    }else {
                         char first = s.peek() ;
                         char last = c[i] ;
                         if (first == '(' && last == ')') {
                              s.pop() ;
                              boo = true ;
                         }else if (first == '{' && last == '}') {
                              s.pop() ;
                              boo = true ;
                         }else if (first == '[' && last == ']') {
                              s.pop() ;
                              boo = true ;
                         }else {
                              boo = false ;
                         }
                    }
               }
          }
          if (s.empty() != true ) {
              
               char d = s.pop() ;
               if (d == '(' || d == '{' || d == '[') {
                    System.out.println( "This expression is NOT correct" ) ;
                    System.out.println( "Error at character # " +   "." + "'" + d + "'" + "- not closed.") ;
               } else {
                    System.out.println( "This expression is NOT correct" ) ;
                    System.out.println( "Error at character # "  +   "." + "'" + d + "'" + "- not opened.") ;
               }
          }
          return boo ;
     }
     
}
