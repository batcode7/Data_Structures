public class waitingRoomManagementList {
     Node head ;
     Node tail ;
     int size ;
     int id ;
     public waitingRoomManagementList () {
          head = null ;
          tail = null ;
          int size = 0 ;
          id = 100 ;
     }
     public void registerPatient (patient p) {
          Node n = new Node (p , null) ;
          if (tail == null) {
               head = n ;
               tail = head ;
               size ++ ;
          }else {
               tail.next = n ;
               tail = n ;
               size++ ;
          }
          
     }
     
     public patient servePatient () {
           if (size == 0) {
                return null ;
          }else {
              Node a = head;
               patient q = head.p ;
               head = head.next ;
               size-- ;
               return q ;
          }
     }
     
     public void showAllPatient () {
        for (Node n = head ; n != null ; n = n.next) {
             System.out.println(n.p.name) ;
          }
          
     }
     
     public String canTheDoctorGoHome () {
          System.out.println(size) ;
          if (size == 0) {
               return "yes" ;
          }else {
               return "no" ;
          }
     }
     
     public String cancelAllAppointments () {
          int s = size ;
          for (Node n = head ; n != null ; n = n.next) {
               n.p = null ;
               s-- ;
          }
          if (s == 0) {
               return "Success" ;
          }else {
               return "Not" ;
          }
     }
}
