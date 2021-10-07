import java.util.* ;
public class Task01 {
     public static void main (String [] args) {
          Scanner scanner = new Scanner(System.in) ;
          System.out.println ("Please type your expression,Sir") ;
          String expression = scanner.nextLine() ;
          System.out.println(check(expression)) ;
     }
     public static boolean check (String a) {
          int b = 0 , c = 0 , d = 0 , e = 0 , f = 0 , g = 0 ;
          for (int i = 0 ; i < a.length() ; i++) {
               if (a.charAt(i) == '(' ){
                    b++ ;
               }else if (a.charAt(i) == ')' ) {
                    c++ ;
               }else if (a.charAt(i) == '{' ) {
                    d++ ;
               }else if (a.charAt(i) == '}' ) {
                    e++ ;
               }else if (a.charAt(i) == '[' ) {
                    f++ ;
               }else if (a.charAt(i) == ']' ) {
                    g++ ;
               }
          }
          if ( b == c && d == e && f == g ) {
               return true ;
          }else {
               return false ;
          }
     }
}
     