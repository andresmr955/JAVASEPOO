public class Main {
    public static void main(String[] args) {
        System.out.println("Todo esta funcionando muy bien");
//Tipo de Objeto-Nombre de objeto - NEW - Instanciando y creando el Obejto
        //Crea instancias, tiene el mismo nombre que la clase que se inizializa y se usa la palabra y new
        Doctor myDoctor = new Doctor("Pedro gonzalez" );
        myDoctor.name = "Andres Marquez Esta es el objeto ya existente";
        myDoctor.showName();


    }
}
