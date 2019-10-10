public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(TipoColor color, int lado) {
        super(color);
        this.lado = lado;
    }


    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un cuadrado.");
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return super.toString() +
                " lado= " + lado + " " + getColor().toString() ;
    }
}
