public class Color implements Comparable<Color>{

    private String matiz;
    private int longitudOnda;

    public Color(String matiz, int longitudOnda) {
        this.matiz = matiz;
        this.longitudOnda = longitudOnda;
    }

    public int getLongitudOnda() {
        return longitudOnda;
    }

    @Override
    public String toString() {
        return "Color{" +
                "matiz='" + matiz + '\'' +
                ", longitudOnda=" + longitudOnda +
                '}';
    }

    @Override
    public int compareTo(Color o) {
        return longitudOnda-o.getLongitudOnda();
    }
}
