public class Cuadrado extends Forma{

    public double lado;

    //metodos
    public Cuadrado(double lado, String color, boolean relleno){
        super(color, relleno);
        this.lado = lado;
    }



    //getters y setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }




}
