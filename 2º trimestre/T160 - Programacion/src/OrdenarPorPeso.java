import java.util.Comparator;

public class OrdenarPorPeso implements Comparator<Militar> {

    @Override
    public int compare(Militar o1, Militar o2) {
        return o1.getPeso()-o2.getPeso();
    }
}
