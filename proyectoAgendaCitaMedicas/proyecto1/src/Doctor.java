import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos 
    static int id=0; //autoincrement 
    private String name;
    private String email;
    private String speciality;


    //Avaible appointment


    
    

    //Constructor
    Doctor(){
        System.out.println("Invocado el objeto constructor");
        
    }

    Doctor(String name, String speciality){
        
        System.out.println("The name of the assigment doctor is: " + name +" And it speciality is: " + speciality);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Métoodos
    public void showName(){
        System.out.println(name);

    }

    public void showId(){
        System.out.println("Id Doct is: "+ id);
    }


    //collection 
    ArrayList<AvaiableAppointment> avaiableAppointments = new ArrayList<>();

    //método que agrega nuevas citas disponibles
    public void addAvaibleAppointmet(Date date, String time){
        //Aumenta la lista de appointments del doctor
        avaiableAppointments.add(new Doctor.AvaiableAppointment(date, time));
    }

    //Devolver el array
    public ArrayList<AvaiableAppointment> getAvaiableAppointments(){
        //Devuelve toda la lista de citas 
        return avaiableAppointments;
    }

    //Clase anidada
    public static class AvaiableAppointment{

        private int id;
        private Date date;
        private String time;
        
        
        public AvaiableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }


        public int getId() {
            return id;
        }


        public void setId(int id) {
            this.id = id;
        }


        public Date getDate() {
            return date;
        }


        public void setDate(Date date) {
            this.date = date;
        }


        public String getTime() {
            return time;
        }


        public void setTime(String time) {
            this.time = time;
        }
        
        
    }
}
