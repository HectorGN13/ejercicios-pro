public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(TipoColor color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un Rectangulo");
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public String toString() {
        return super.toString() +
                " base= " + base + " altura= " + altura + " " + getColor().toString();
    }
}
