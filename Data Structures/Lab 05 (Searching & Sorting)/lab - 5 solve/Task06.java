import java.util.* ;
public class Task06 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in) ;
          int [] a = {21,1,2,5,9,40,50} ;
          int b = sc.nextInt() ;
          if ( binarySearch (a , 0 , 6 , b) == -1 ) {
          System.out.println( "does not exists") ;
          }else {
               System.out.println( binarySearch (a , 0 , 6 , b) ) ;
          }
     }
               
     public static int binarySearch (int [] a , int l , int r , int num ) {
          int m = (l + r) / 2 ;
          if (l == r) {
               if (a[m] == num) {
                    return m ;
               }else {
                    return - 1 ;
               }
          }else if (a[m] == num) {
               return m ;
          }else if (a[m] > num) {
               return binarySearch (a , l , m , num) ;
          }else {
               return binarySearch (a , m + 1 , r , num) ;
          }
     }
}