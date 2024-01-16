package models;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor  extends User{
    // Atributos 
    private String speciality;

    public Doctor(String name, String email){
        super(name,email);
    }

    //collection 
    private ArrayList<AvaiableAppointment> avaiableAppointments = new ArrayList<>();

    //método que agrega nuevas citas disponibles
    public void addAvaibleAppointmet(String date, String time){
        //Aumenta la lista de appointments del doctor
        avaiableAppointments.add(new Doctor.AvaiableAppointment(date, time));
    }

    //Devolver el array
    public ArrayList<AvaiableAppointment> getAvaiableAppointments(){
        //Devuelve toda la lista de citas 
        return avaiableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvaible " + avaiableAppointments.toString();
    }

    //Clase anidada
    public static class AvaiableAppointment{

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        
        public AvaiableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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


        public String getDate(String DATE) {
            return format.format(date);
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
        
        @Override
        public String toString() {
            return "Avaible appointments \nDate: "+ date + "\nTime: " +time;
        }
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvaiableAppointments(ArrayList<AvaiableAppointment> avaiableAppointments) {
        this.avaiableAppointments = avaiableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: la buena esperanza");
        System.out.println("Hospital: Cruz roja");
    }
}
