import java.util.* ;
public class Task04 {
     public static void main (String [] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please type a number :") ;
          int a = sc.nextInt() ;
          
          System.out.println( "Binary value of " + a + " is  " + dtb ( a , "" )) ;
     }
     
     public static String dtb ( int num , String b) {
         if (num != 0) {
               b =  num % 2  + b ;
               return dtb(num/2 , b);
          }else {
                return b ;
          }
     }
}

