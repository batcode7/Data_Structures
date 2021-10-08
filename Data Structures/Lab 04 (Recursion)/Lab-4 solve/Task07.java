import java.util.* ;
public class Task07 {
     public static void main (String []args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please type a string :") ;
          int a = sc.nextInt() ;
          System.out.println("Please type a string :") ;
          int b = sc.nextInt() ;
          System.out.println("Please type a string :") ;
          int c = sc.nextInt() ;
          System.out.println("Please type a string :") ;
          int d = sc.nextInt() ;
          System.out.println("Please type a string :") ;
          int e = sc.nextInt() ;
          System.out.println("Please type a string :") ;
          int f = sc.nextInt() ;
          Node head = null ;
          Node n1 = new Node (a , null) ;
          Node n2 = new Node (b , null) ;
          Node n3 = new Node (c , null) ;
          Node n4 = new Node (d , null) ;
          Node n5 = new Node (e , null) ;
          Node n6 = new Node (f , null) ;
          n1.next = n2 ;
          n2.next = n3 ;
          n3.next = n4 ;
          n4.next = n5 ;
          n5.next = n6 ;
          n6.next = null ;
          head = n1 ;
          print(head) ;
     }
     public static void print(Node head) {
          if (head == null) { 
          }else {
               print(head.next); 
               System.out.print(head.element+" "); 
           }
     } 
}