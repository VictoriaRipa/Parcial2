public class Rectangulo extends Forma {

    public double length = 1.0;
    public double widht = 1.0;

    public Rectangulo(){

    }

    public Rectangulo(double widht, double length) {
        this.widht=widht;
        this.length=length;
    }
    public Rectangulo(double widht, double length, String color, boolean relleno){
        super(color, relleno);
        this.widht = widht;
        this.length = length;

    }

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

    @Override
    public double getArea() {
        return widht*length;
    }

    @Override
    public double getPerimetro() {
        return widht*2+length*2;
    }
}
