public class Cuadrado extends Forma{

    public double lado;

    //metodos
    public Cuadrado(){
        return;
    }

    public Cuadrado(double lado){
    this.lado = lado;
    }

    public Cuadrado(double lado, String color, boolean relleno){
        this.lado = lado;
        this.color = color;
        this.relleno = relleno;
    }



    //getters y setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }




}
