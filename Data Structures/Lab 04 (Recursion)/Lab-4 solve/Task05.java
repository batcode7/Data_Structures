import java.util.* ;
public class Task05 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please type a number :") ;
          int a = sc.nextInt() ;
          System.out.println("Please type a number :") ;
          int n = sc.nextInt() ;
          System.out.println( a + " to the power " + n + " is " + expo (a , n)) ;
     }
     
     public static int expo (int a , int n) {
          if (n == 0) {
               return 1 ;
          }else {
               int x = expo(a , n / 2) ;
               if (n % 2 == 0) {
                    return x*x ;
               }else {
                    return a*x*x ;
               }
          }
     }
}