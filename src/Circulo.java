public class Circulo extends Forma{

    public double radio = 1.0;

    //metodos
    public void calcularRadioCirculo (){
        return;
    }

    public void calcularRadioCirculo (double radio){
        this.radio = radio;
    }

    public void calcularRadioCirculo (double radio, String color, boolean relleno){
        this.radio = radio;
        this.color = color;
        this.relleno = relleno;
    }

}
