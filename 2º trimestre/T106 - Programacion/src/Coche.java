public class Coche {

    Matricula matricula;
    String marca;

    public Coche( String marca) {
        this.marca = marca;
    }

    public void setMatricula(Matricula matricula) {
        assert matricula != null : "Error: un coche necesita matricula";
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", matricula: "+ this.matricula.toString();
    }
}
