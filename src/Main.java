public class Main {
    public static void main(String[] args) {

        //creamos formas
    Forma circulo1 = new Circulo(1.0, "red", false);
    Forma rectangulo1 = new Rectangulo(1.0, 1.0, "red", false);
    Forma cuadrado1 = new Cuadrado(1.0, "red", false);

    System.out.println("Circulo:");
    System.out.println(circulo1);
    System.out.println("Rectangulo:");
    System.out.println(rectangulo1);
    System.out.println("Cuadrado:");
    System.out.println(cuadrado1);

    }
}
