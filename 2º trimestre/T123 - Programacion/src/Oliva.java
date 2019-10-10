public class Oliva {

    public static final long BLACK = 0X000000;

    public String oliveName;
    public long color = BLACK;


    public Oliva() {
    }

    public Oliva(String oliveName) {
        this.oliveName = oliveName;
    }

    public Oliva(String oliveName, long color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "oliveName='" + oliveName + '\'' +
                ", color=" + color +
                '}';
    }
}
