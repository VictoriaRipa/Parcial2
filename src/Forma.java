public abstract class Forma {

    public String color;
    public boolean relleno;

    //metodos

    public Forma(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }

    //getters y setters
    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double area;
    public void setArea(double area) {
        this.area = area;
    }

    double perimetro;
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
