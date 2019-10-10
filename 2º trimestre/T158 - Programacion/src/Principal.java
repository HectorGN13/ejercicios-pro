import java.util.LinkedList;

public class Principal {


    public static void main(String[] args) {

        LinkedList<Persona> reparto = new LinkedList<>();
        reparto.add(new Persona("Julian Muñoz"));
        reparto.add(new Persona("Aghata Cristy"));
        reparto.add(new Persona("La Pantoja"));
        reparto.add(new Persona("Eduardo Barra Balao"));

        Reparto r1 = new Reparto(reparto);

        Cartelera c1 = new Cartelera();
        c1.agregarPelicula(new Pelicula("Dead Pool",120),r1);

        System.out.println(c1);

    }
}
