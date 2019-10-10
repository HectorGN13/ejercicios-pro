import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {



        Militar m1 = new Militar("Castillo", 72, TipoRango.SOLDADO);
        Militar m2 = new Militar("Castillo", 80, TipoRango.CAPITAN);
        Militar m3 = new Militar("Jerez", 75, TipoRango.TENIENTE);
        Militar m4 = new Militar("Henry", 70, TipoRango.SARGENTO);
        Militar m5 = new Militar("Hector", 65, TipoRango.GENERAL);

        List<Militar> lista = Arrays.asList(m1, m2, m3, m4, m5);
        ArrayList<Militar> militares = new ArrayList<>(lista);

        System.out.println(militares);
        System.out.println();
        System.out.println("Militares ordenados por rango:");
        militares.sort(Militar::compareTo);
        System.out.println(militares);
        System.out.println("Militares ordenados por nombre");
        militares.sort(new OrdenarPorNombre());
        System.out.println(militares);
        System.out.println("Militares ordenados por peso");
        militares.sort(new OrdenarPorPeso());
        System.out.println(militares);


    }
}
