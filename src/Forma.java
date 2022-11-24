public abstract class Forma {

    public String color;
    public boolean relleno;

    //metodos
    public void mostrarForma() {

    }

    public void mostrarForma(String color, boolean relleno){
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







}
