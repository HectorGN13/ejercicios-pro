import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Militar> {

    @Override
    public int compare(Militar o1, Militar o2) {
        return o1.getAlias().compareTo(o2.getAlias());
    }
}
