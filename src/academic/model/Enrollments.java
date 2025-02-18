package academic.model;

/**
 * @author 12S23001-Kevin Gultom
 * @author 12S23010-Tiffani Butar-butar
 */
public class Enrollments {
        private String id;
        private String nim;
        private String year;
        private String subject;
        private String None = "None";
    
        public Enrollments(String id, String nim, String year, String subject, String None) {
            this.id = id;
            this.nim = nim;
            this.year = year;
            this.subject = subject;
            this.None = None;
        }
        
        public String getId() {
            return id;
        }
        public String getNim() {
            return nim;
        }
        public String getYear() {
            return year;
        }
        public String getSubject() {
            return subject;
        }
        public String getNone() {
            return None;
        }

        @Override 
        public String toString(){
            return  id + "|" + nim + "|" + year + "|" + subject + "|" + None;
        }
    
    }
        