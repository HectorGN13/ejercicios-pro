public class Alumno {

    //Atributos

    private String alias;

    //Nombre completo

    private String nombre;
    private String ape1;
    private String ape2;

    private int anioNac;        // Año de nacimiento

    //CONSTRUCTOR


    public Alumno() {
        alias = "";
        nombre = "";
        ape1 = "";
        ape2 = "";
        anioNac = 0;
    }

    public Alumno(String alias) {
        this.alias = alias;
    }

    public Alumno(String alias, int anioNac) {
        this.anioNac = anioNac;
        this(alias); // te dice que la llamada tiene que estar en la primera linea del cuerpo sino error.
    }

    @Override
    public String toString() {
        return ape1 + " " + ape2 + ", " + nombre + " ("+alias+") nacido el año "+ anioNac;
    }
}
