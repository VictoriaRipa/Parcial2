public class Circulo extends Forma{

    public double radio=1.0;

    public Circulo (){

    }
    public Circulo (double radio) {this.radio=radio;}

    public Circulo (double radio, String color, boolean relleno){
        super(color, relleno);
        this.radio = radio;
    }


    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double getArea() {
        return getRadio()*2*3.14;
    }

    @Override
    public double getPerimetro() {
        return getRadio()*getRadio()*3.14;
    }
}
