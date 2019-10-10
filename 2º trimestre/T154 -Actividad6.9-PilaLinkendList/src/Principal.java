import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        Fregadero f1 = new Fregadero();

        f1.meter(new Plato(TipoColor.BLANCO));     // primero en entrar
        f1.meter(new Plato(TipoColor.ROSA));
        f1.meter(new Plato(TipoColor.VERDE));
        f1.meter(new Plato(TipoColor.CELESTE));

        f1.mostrar();
        System.out.println("----------------------");
        f1.fregar();
        f1.mostrar();
    }
}
