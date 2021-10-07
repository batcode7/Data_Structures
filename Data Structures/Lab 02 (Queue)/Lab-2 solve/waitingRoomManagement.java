public class waitingRoomManagement {
     Object [] data ;
     int start ;
     int size ;
     int id ;
     public waitingRoomManagement () {
          data = new Object [5] ;
          start = 0 ;
          size = 0 ;
          id = 100 ;
     }
     public void registerPatient (patient p)throws QueueOverflowException {
          if (size == data.length) {
              throw new QueueOverflowException();
          }else {
               p.id = id ;
               id++ ;
               data[(start + size) % data.length] = p ;
               size++ ;
          }
     }
     public patient servePatient ()throws QueueUnderflowException {
          if (size == 0) {
               throw new QueueUnderflowException();
          }else {
               patient pat = (patient)data[start] ;
               data [start] = null ;
               start = (start + 1) % data.length ;
               size-- ;
               return pat ;
          }
     }
     public void showAllPatient () {
          patient [] patr = new patient [size] ;
          for (int i = 0 ; i < size   ; i++) {
               patr[i] = (patient)data[(start + i) % 5] ;
          }
          for (int i = 0 ; i < size - 1 ; i++) {
               for (int j = i+1 ; j < patr.length ; j++ ) {
                    if ((((patr[i]).name). compareTo(( patr[j]).name)) > 0){
                        // System.out.println ((((patr[i]).name). compareTo(( patr[j]).name))) ;
                         patient temp = patr[i] ;
                         patr[i] = patr [j] ;
                         patr[j] = temp ;
                    }
               }
          }
          
          for (int i = 0 ; i < size ; i++) {
               System.out.println (patr[i].name + " ---> " + patr[i].bloodGroup + " ---> " + patr[i].id ) ;
          }
     }
     public String canTheDoctorGoHome () {
          if (size == 0) {
               return "yes" ;
          }else {
               return "no" ;
          }
     }
     public String cancelAllAppointments () {
          int siz = size ;
          for (int i = 0 ; i < siz ; i++) {
               data[start] = null ;
               patient pat = (patient)data[start] ;
               start = (start + 1) % data.length ;
               siz-- ;
          }
          if (siz == 0) {
               return "Success" ;
          }else {
               return "Not" ;
          }
     }
}
