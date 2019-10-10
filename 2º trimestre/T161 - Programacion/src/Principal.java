import java.util.SortedSet;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

        SortedSet<Color> colores = new TreeSet<>();

        colores.add(new Color("AMARILLO",570));
        colores.add(new Color("ROJO",620));
        colores.add(new Color("VIOLETA",400));
        colores.add(new Color("NARANJA",590));
        colores.add(new Color("AZUL",450));
        colores.add(new Color("VERDE",500));

        System.out.println(colores);

    }
}
