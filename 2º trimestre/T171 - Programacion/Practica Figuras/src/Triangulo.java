public class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo(TipoColor color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un triangulo;");
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                " base= " + base + " altura= " + altura + " " + getColor().toString();
    }
}
