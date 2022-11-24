public class Cuadrado extends Forma{

    public double lado;

    //metodos
    public void calcularLadosCuadrado(){
        return;
    }

    public void calcularLadosCuadrado(double lado){
    this.lado = lado;
    }

    public void calcularLadosCuadrado(double lado, String color, boolean relleno){
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
