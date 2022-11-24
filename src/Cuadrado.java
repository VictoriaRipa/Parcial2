public class Cuadrado extends Rectangulo{

    public Cuadrado (){

    }
    public double lado;

    public Cuadrado(double lado, String color, boolean relleno){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void setWidht(double widht) {
        super.setWidht(getLado());
    }

    @Override
    public void setLength(double length) {
        super.setLength(getLado());
    }
}
