public class Patient {

    //atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birhtday;
    private double weight;
    private Double height;
    private String blood;
// Metodo constructor con unos parametros minmos creados
    Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
    }
    //Public: es el modificador de acceso
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getHeight() {
        return height + "Mts";
    }
    public String getWeight(){
        return this.weight + "Kg. ";
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
        };
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe ser de 8 digitos maximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
    public String getBirhtday() {
        return birhtday;
    }
    public void setBirhtday(String birhtday) {
        this.birhtday = birhtday;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
}
