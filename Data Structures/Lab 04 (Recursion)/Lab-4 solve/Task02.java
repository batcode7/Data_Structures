import java.util.* ;
public class Task02 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
         System.out.println("Please type a number :") ;
         int n = sc.nextInt() ;
          System.out.println("The value of " + n + "th term is " + fibo (n)) ;
     }
     
     public static int fibo (int n) {
          if (n <= 1) {
               return n ;
          }else {
               return fibo(n - 1)+fibo(n - 2) ;
          }
     }
}