import java.util.Objects;

public class Matricula {

    String formato;

    public Matricula(String formato) {

    }

    public void setFormato(String formato) {
        assert formato.substring(0,4)
        this.formato = formato;
    }

    @Override
    public String toString() {
        return String.format("%d%d%d%d",millares,centenas,decenas,unidades) + "-" + letras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return millares == matricula.millares &&
                centenas == matricula.centenas &&
                decenas == matricula.decenas &&
                unidades == matricula.unidades &&
                Objects.equals(letras, matricula.letras);
    }
}
