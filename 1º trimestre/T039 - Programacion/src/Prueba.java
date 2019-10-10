public class Prueba {

    private int id;
    private static int contador = 0;
    private static final int MAX = 5;

    public Prueba() {
        setId(++contador);
    }

    public void setId(int id) {
        assert id <= MAX : "Error no puedes crear mas de 5 instancias de esta clase";
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "id=" + id +
                '}';
    }
}
