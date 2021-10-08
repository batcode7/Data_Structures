import java.util.* ;
public class Task01 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
         System.out.println("Please type a number :") ;
         int n = sc.nextInt() ;
          System.out.println("Factorial of " + n + " is " + fact (n)) ;
     }
     
     public static int fact (int n) {
          if (n == 0) {
               return 1 ;
          }else {
               return n*fact(n-1) ;
          }
     }
}