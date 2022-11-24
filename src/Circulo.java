public class Circulo extends Forma{

    public double radio;

    //metodos
    public Circulo (){
        return;
    }

    public Circulo (double radio){
        this.radio = radio;
    }

    public Circulo (double radio, String color, boolean relleno){
        this.radio = radio;
        this.color = color;
        this.relleno = relleno;
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
