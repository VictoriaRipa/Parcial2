public abstract class Forma {

    public String color;
    public boolean relleno;

    public Forma(){

    }
    public Forma(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

}
