import java.util.ArrayList;
import java.util.HashMap;

public class Persona {

    private String alias;
    private int altura;

    public Persona(String alias, int altura) {
        this.alias = alias;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "alias='" + alias + '\'' +
                ", altura=" + altura +
                '}';
    }

    public String getAlias() {
        return alias;
    }
}
