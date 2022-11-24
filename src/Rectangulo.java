public class Rectangulo extends Forma {

    public double length = 1.0;
    public double widht = 1.0;

    //metodos
    public Rectangulo(){
        return;
    }

    public Rectangulo(double widht, double length){
        this.widht = widht;
        this.length = length;
    }

    public Rectangulo(double widht, double length, String color, boolean relleno){
        this.widht = widht;
        this.length = length;
        this.color = color;
        this.relleno = relleno;
    }

    //getters y setters
    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }




}
