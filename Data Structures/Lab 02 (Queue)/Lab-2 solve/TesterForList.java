public class TesterForList {
     public static void main (String [] args) {
          waitingRoomManagementList wrm = new waitingRoomManagementList();
          patient p1 = new patient ("D" , 15 , "B+") ;
          patient p2 = new patient ("A" , 5 , "AB+") ;
          patient p3 = new patient ("B" , 8 , "B-") ;
          patient p4 = new patient ("C" , 8 , "AB-") ;  
          patient p5 = new patient ("E" , 8 , "AB-") ;
          patient p6 = new patient ("F" , 8 , "AB-") ;
          
          
          wrm.registerPatient(p1) ;
          wrm.registerPatient(p2) ;
          wrm.registerPatient(p3) ;
          wrm.registerPatient(p4) ;
          
          
          
          
          //wrm.showAllPatient() ;
          
          
          //System.out.println(wrm.servePatient().name) ;
          //System.out.println(wrm.servePatient().name) ;
          // System.out.println(wrm.servePatient().name) ;
          //System.out.println(wrm.servePatient().name) ;
          
          
          System.out.println (wrm.cancelAllAppointments ()) ;
          System.out.println(wrm.canTheDoctorGoHome()) ;
     }
}