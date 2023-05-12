import java.util.ArrayList;
import java.util.Date;


public class Doctor{
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;


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

    //#paso7 devolver el array que se acabo de hacer

    public ArrayList<AvailableAppoinment> getAvailableAppoinments(){
        return availableAppoinments;
    }
    //#paso6 crear la coleccion de objetos y se instancia

    ArrayList<AvailableAppoinment> availableAppoinments = new ArrayList<>();

    //#paso5 crear el metodo que va anadir nuevas fechas

    public void addAvailableAppoinment(Date date, String time){
        availableAppoinments.add(new Doctor.AvailableAppoinment(date,time));
    }
    //Clase independiente #paso1 -Es donde se crea la clase para agendar citas
    public static class AvailableAppoinment{
        //#paso2 crear atributos
        private int id;
        private Date date;
        private String time;
        //#paso3 crear constructor

        public AvailableAppoinment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        //#paso4 crear getters&setters

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

    //enumerations
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    Day day;
    switch (day) {
        case MONDAY:
            System.out.println("Mondays are good.");
            break;
        case FRIDAY:
            System.out.println("Fridays are nice");
            break;
        case SATURDAY: case: SUNDAY:
        System.out.println("Weekends are the best");
            break;
        default:
            System.out.println("Midweek are so-so");
            break;

    }
    Day.MONDAY;
    Day.FRIDAY;
    Day.SATURDAY

    }
}