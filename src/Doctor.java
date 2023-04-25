import javax.print.Doc;

public class Doctor {
    // atributos o propiedades
    int id;
    String name;
    String speciality;
    //Aquivisualizamos el constructor doctor aunque normalmente no esta
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name){
        System.out.println("El mombre del doctor asignado es " + name);
    }
    //Comportamientos
    public void showName(){ // se declara un metodo
        System.out.println(name); //Nos permite imprimer lo que llamemos en este caso name
    }

}
