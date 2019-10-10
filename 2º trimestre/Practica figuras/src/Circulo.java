public class Circulo extends Figura {


    private double radio;

    public Circulo(TipoColor color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un circulo.");
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radio= " + radio + getColor().toString() ;
    }
}
