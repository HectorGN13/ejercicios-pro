import java.util.Arrays;

public class Persona {

    private int edad;
    private Persona[] hijos;

    public Persona(Persona[] hijos) {
        this.hijos = hijos;
    }

    public void setEdad(int edad) {
        assert edad >= 0 : "Error: una persona no puede tener menos de cero anios";
        this.edad = edad;
    }

    public Persona[] getHijos() {
        return hijos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", hijos=" + Arrays.toString(hijos) +
                '}';
    }
}
