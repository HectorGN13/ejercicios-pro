import java.util.Calendar;

public class Alumno {

    private String alias;

    // Nombre Completo

    private String nombre;
    private String ape1;
    private String ape2;

    private int anioNac;            // >= 1900

    /**
     * Constructor sin parametros
     */
    public Alumno() {
    }

    /**
     * Constructor
     * @param alias
     */
    public Alumno(String alias) {
        setAlias(alias);
    }

    /**
     * Constructor
     * @param alias
     * @param anioNac
     */
    public Alumno(String alias, int anioNac) {
        setAlias(alias);
        setAnioNac(anioNac);
    }

    // Accesores

    public String getAlias() {
        return alias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public int getAnioNac() {
        return anioNac;
    }


    // Mutadores

    public void setAnioNac(int anioNac) {
        assert anioNac >= 1900 : "Error: el año de nacimiento tiene que ser mayor o igual que 1900.";
        this.anioNac = anioNac;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    // Otros

    public void contarPares(int desde, int hasta) {
        int contador = 0;
        if (desde > hasta) {
            System.err.println("Error: desde no puede ser mayor que hasta");
        } else {
            for (int i = desde; i < hasta; i++) {
                if (i % 2 == 0) {
                    contador++;
                }
            }
        }
    }

    public int edad() {
        return Calendar.getInstance().get(Calendar.YEAR) - anioNac;
    }

    public String nombreCompleto() {
        return nombre + " " + ape1 + " " + ape2;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "alias='" + alias + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", anioNac=" + anioNac +
                '}';
    }
}
