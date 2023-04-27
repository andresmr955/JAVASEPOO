import javax.print.Doc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Todo esta funcionando muy bien");
//Tipo de Objeto-Nombre de objeto - NEW - Instanciando y creando el Obejto
        //Crea instancias, tiene el mismo nombre que la clase que se inizializa y se usa la palabra y new
        Doctor myDoctor = new Doctor(  ); //Se va a cambiar para que siempre que se cree un objeto de tipo doctor, siempre lo este deifiniendo un nuevo identificador
        myDoctor.name = "Andres Marquez Esta es el objeto ya existente";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        //System.out.println(Doctor.id);


    }
}
