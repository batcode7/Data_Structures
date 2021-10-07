public class WRM {
     Object [] a ;
     int start ;
     int size ;
     int id ;
     public WRM () {
          a = new Object [5] ;
          start = 0 ;
          size = 0 ;
          id = 100;
          
     }
     public void registerPatient(patient p) {
          if (size >= a.length) {
               System.out.println("Out of size") ;
          }else {
               p.id = id ;
               id++ ;
               a [(start + size) % a.length] = p ;
               size++ ;
          }
     }
     
     public patient servePatient () {
          if (size == 0) {
               System.out.println("no more patients left");
               return null ;
          }else {
               patient pat = (patient)a[start] ;
               a[start] = null ;
               start = (start + 1) % a.length ;
               size-- ;
               return pat ;
          }
     }
     public void showAllPatient () {
          int str = start ;
          for (int i = 0 ; i < size ; i++) {
               patient  pat = (patient) a[str] ;
               str = (1 + str) % a.length ;
               System.out.println(pat.name + "--->" + pat.id) ;
          }
     }
     public boolean canDoctorGoHome () {
          if (size == 0) {
               return true ;
          }else {
               return false ;
          }
     }
     public String cancelAllAppointment () {
          int sz = size ;
          for (int i = 0 ; i < size ; i ++) {
               patient pat = (patient)a[start] ;
               a[start] = null ;
               start = (start + 1) % a.length ;
               sz-- ;
          } 
          System.out.println(sz) ;
          if (sz == 0) {
               return "Success" ;
          }else {
               return "Not" ;
          }
     }
}
