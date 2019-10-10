import java.util.Random;

public class Personaje {
    private String alias;
    private boolean gafas;
    private boolean fuma;
    private boolean sombrero;
    private TipoColorPelo colorPelo;
    private char genero;                // 'V' = Varon o 'F' = Femenino

    public Personaje(String alias, boolean gafas, boolean fuma, boolean sombrero, TipoColorPelo colorPelo, char genero) {
        setAlias(alias);
        this.gafas = gafas;
        this.fuma = fuma;
        this.sombrero = sombrero;
        setColorPelo(colorPelo);
        setGenero(genero);
    }

    private void setAlias(String alias) {
        assert alias != null: "El alias no puede ser nulo";
        assert !alias.isEmpty(): "El alias no puede ser vacio";

        this.alias = alias;
    }

    private void setColorPelo(TipoColorPelo colorPelo) {
        assert colorPelo != null: "El color de pelo no puede ser nulo";

        this.colorPelo = colorPelo;
    }

    private void setGenero(char genero) {
        assert preGenero(genero) : "El genero debe ser 'V' o 'F'";

        this.genero = genero;
    }

    public static boolean preGenero(char genero) {
        return (genero == 'V' || genero == 'F');
    }

    public boolean isGafas() {
        return gafas;
    }

    public boolean isFuma() {
        return fuma;
    }

    public boolean isSombrero() {
        return sombrero;
    }

    public String toString() {
        return "Nombre: " + alias + "\nGafas: " + gafas + "\nFuma: " + fuma + "\nSombrero: " + sombrero + "\nColor de pelo: " + colorPelo + "\nGenero: " + genero + "\n------------------------------";
    }
}
