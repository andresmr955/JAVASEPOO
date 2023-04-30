import java.util.Date;
import java.util.ArrayList;
public class Doctor {
    // atributos o propiedades
    static int id = 0;// autoincrement
    private String name;
    private String email;
    private String speciality;




    //Aqui visualizamos el constructor doctor aunque normalmente no esta
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

        Doctor(String name, String speciality){
            System.out.println("El nombre del Doctor asignado es: " + name);
            id++;
            this.name = name;//"Andres Marquez""andresmr955@gmail.com"
            this.speciality = speciality;

        }



    //Comportamientos
    public void showName(){ // se declara un metodo
        System.out.println(name); //Nos permite imprimer lo que llamemos en este caso name
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    //Available appointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppoinment(Date date, String time){}

    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
    }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
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
