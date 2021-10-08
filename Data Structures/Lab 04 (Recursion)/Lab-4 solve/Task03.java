import java.util.* ;
public class Task03 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please type a array size :") ;
          int n = sc.nextInt() ;
          int []  a = new int [n] ;
          for (int i = 0 ; i < n ; i++) {
               a[i] = sc.nextInt() ;
          }
          print (a , 0) ;
     }
     public static void print (int [] n , int i) {
          if (i == 0) {
               System.out.print ("[") ;
          }
          if (i == n.length) {
               
          }else {
               System.out.print(n[i] + " ") ;
               print (n , i + 1) ;
          }
          if (i == n.length - 1) {
               System.out.println ("]") ;
          }
     }
}