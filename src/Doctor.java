import java.util.ArrayList;
import java.util.Date;
public class Doctor{
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    //Available appoinment

    Doctor(){
        System.out.println("Construyendo el metodo constructor");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: " + name + speciality);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Metodos o Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor " + id);
    }
    ArrayList<AvailableAppoinment> availableAppoinments = new ArrayList<>();
    public void addAvailableAppoinment(Date date, String time){
        availableAppoinments.add(new Doctor.AvailableAppoinment(date,time));
    }

    public ArrayList<AvailableAppoinment> getAvailableAppoinments(){
        return availableAppoinments;
    }
    public static class AvailableAppoinment{
        private int id;
        private Date date;
        private String time;
        public AvailableAppoinment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

    }
}