import java.util.* ;
public class Task07 {
      public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please type a number :") ;
          int n =  sc.nextInt() ;
          System.out.println("The value of " + n  + "th term is " + fibo (n - 1)) ; 
     }
     
     public static int[] A = new int [200] ;
     public static int fibo (int n) {
          if (A[n] > 0) {
               return A[n] ;
          }
          if (n == 1 || n == 0 ) {
               return A[n] = 1 ;
          }else {
               return A[n] = fibo(n - 1) + fibo(n - 2) ;
          }
          
     }
}