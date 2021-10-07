public class Tester {
     public static void main (String [] args) {
          waitingRoomManagement wrm = new waitingRoomManagement();
          patient p1 = new patient ("D" , 15 , "B+") ;
          patient p2 = new patient ("A" , 5 , "AB+") ;
          patient p3 = new patient ("B" , 8 , "B-") ;
          patient p4 = new patient ("C" , 8 , "AB-") ;  
          patient p5 = new patient ("E" , 8 , "AB-") ;
          patient p6 = new patient ("F" , 8 , "AB-") ;
          try {
               wrm.registerPatient(p1) ;
               wrm.registerPatient(p2) ;
               wrm.registerPatient(p3) ;
               wrm.registerPatient(p4) ;
               wrm.registerPatient(p5);
               wrm.registerPatient(p6);
          }
          catch(QueueOverflowException e){
               System.err.print(e);
               System.out.println(" Sorry!! NO more slot left for appoinments :(");
          }
          
          wrm.showAllPatient() ;
          
          try {
               System.out.println(wrm.servePatient().name) ;
               System.out.println(wrm.servePatient().name) ;
               System.out.println(wrm.servePatient().name) ;
               System.out.println(wrm.servePatient().name) ;
          }
          catch(QueueUnderflowException e){
               System.err.print(e);
           }
          System.out.println (wrm.cancelAllAppointments ()) ;
          System.out.println(wrm.canTheDoctorGoHome()) ;
     }
}