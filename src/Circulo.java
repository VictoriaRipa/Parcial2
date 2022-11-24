public class Circulo extends Forma{

    public double radio;

    //metodos

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
}
