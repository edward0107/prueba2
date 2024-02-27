public class Persona {
    private  String name;
    private   String Las_name;
    private  String Dress;
    private int phone;
    private   int date_born;

    public Persona(){}
    public Persona(String name, String las_name, String dress,int phone, int date_born){
        name=this.name;
        las_name=this.Las_name;
        dress= this.Dress;
        phone=this.phone;
        date_born=this.date_born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLas_name() {
        return Las_name;
    }

    public void setLas_name(String las_name) {
        Las_name = las_name;
    }

    public String getDress() {
        return Dress;
    }

    public void setDress(String dress) {
        Dress = dress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getDate_born() {
        return date_born;
    }

    public void setDate_born(int date_born) {
        this.date_born = date_born;
    }

    public void crear(){
        System.out.println("Creando");
    }
    public void leer(){
        System.out.println("leyendo");
    }
    public void actualizar(){
        System.out.println("Actualizando");
    }
    public void borrar(){
        System.out.println("Borrando");
    }

}
