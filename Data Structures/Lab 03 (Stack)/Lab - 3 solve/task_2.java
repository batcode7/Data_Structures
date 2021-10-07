import java.util.* ;
public class task_2 {
       public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in) ;
          System.out.println ("Please type your expression,Sir") ;
          String expression = scanner.nextLine() ;
          if (check(expression) ) {
               System.out.println ("This expression is correct.") ;
          }
     }
     static int j = 0 ;
     public static boolean check (String a) {
          int o = 0 ;
          boolean boo = false ;
          listStack  s = new listStack () ;  // deplopying a listStack naming s
          char[] c = a.toCharArray();  // creating a char type array 
          int []d = new int [c.length] ; // array containing only the indexes of brackets
          for (int i = 0 ; i <  c.length ; i++ ) {
               if (c[i]=='('||c[i]=='{'||c[i]=='[' ) { // adding values to stack
                    s.push (c[i]) ;
                    d[j] = i ;
                    j++ ;
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
                              d[j - 1] = 0 ;
                              j-- ;
                         }else if (first == '{' && last == '}') {
                              s.pop() ;
                              boo = true ;
                              d[j - 1] = 0 ;
                              j-- ;
                         }else if (first == '[' && last == ']') {
                              s.pop() ;
                              boo = true ;
                              d[j - 1] = 0 ;
                              j-- ;
                         }else {
                              boo = false ;
                              o = d [j - 1] ;
                         }
                    }
               }
          }
          if (s.empty() != true ) {
               char k = s.pop() ;
               if (k == '(' || k == '{' || k == '[') {
                    System.out.println( "This expression is NOT correct." ) ;
                    System.out.println( "Error at character # " + (o + 1) +   "." + "'" + k + "'" + "- not closed.") ;
               } else {
                    System.out.println( "This expression is NOT correct." ) ;
                    System.out.println( "Error at character # " + (o + 1) +   "." + "'" + k + "'" + "- not opened.") ;
               }
          }
          return boo ;
     }
}
