public class Task02 {
     public static void main (String [] args) {
          int [] a = {210,1,2,5,9,40,50} ;
          int [] B = recursiveInsertionSort(a , 1) ;
          for (int l = 0 ; l < B.length  ; l++) {
               System.out.print(B[l] + " ") ;
          }
          System.out.println() ;
     }
     
     public static int [] recursiveInsertionSort (int [] A , int i) {
          int temp = 0 ;
          if (i == A.length) {
               return A ;
          }else {
               for (int j = 0 ; j < i ; j++) {
                    if (A[i] < A[j]) {
                         temp = A[i] ;
                         A[i] = A[j] ;
                         A[j] = temp ;
                    }
               }
               return recursiveInsertionSort ( A , i + 1) ;
          }
     }
}