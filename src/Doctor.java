public class Doctor {
    // atributos o propiedades
    static int id = 0;// autoincrement
    String name;
    String email;
    String speciality;

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

}
