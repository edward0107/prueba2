public class Empleado {
private static  int cod_empleado;
private  int contador;
private String puesto;

private Empleado(){}

public Empleado(String puesto){
    contador=++Empleado.cod_empleado;
    puesto=this.puesto;
}

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
