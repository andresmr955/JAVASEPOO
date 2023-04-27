public class Doctor {
    // atributos o propiedades
    static int id = 0; //Autoincrement, variable estatica
    String name;
    String speciality;

    //Aqui visualizamos el constructor doctor aunque normalmente no esta
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name){
        this.name = name;
        System.out.println("Este es el nuevo objeto donde El mombre del doctor asignado es " + name);
    }


    //Comportamientos
    public void showId(){ // se declara un metodo
        System.out.println("ID Doctor: " + Doctor.id); //Nos permite imprimer lo que llamemos en este caso name
    }
    public void showName(){ // se declara un metodo
        System.out.println(name); //Nos permite imprimer lo que llamemos en este caso name
    }

}
