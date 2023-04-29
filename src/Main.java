import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Andres","Programador ");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        //b=0

        Patient patient = new Patient("Andres", "Andres@gmail.oom");

        Patient patient2 = new Patient("Alejandra", "alejandra@gmail.oom");

        System.out.println("Este es el paciente 1 " + patient.getName());
        System.out.println("Este es el paciente 2 " + patient2.getName());
        patient2 = patient;

        System.out.println("Este es el nuevo paciente 1 " + patient.getName());
        System.out.println( "Este es el paciente 1 asignado al dos " + patient2.getName());

        //Aqui se aprendio como encapsular y autilizar los modificadores de acceso de acceso como private, protected, public,default
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }
}
