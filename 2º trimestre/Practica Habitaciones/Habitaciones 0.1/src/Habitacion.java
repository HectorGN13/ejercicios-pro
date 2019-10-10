import java.util.Arrays;

public class Habitacion {
    private Puerta[] puertas;   // longitud=4
    private Casa casa;          // NOT NULL

    public Habitacion(Casa casa) {
        this.puertas = new Puerta[4];   // 0=NORTE, 1=ESTE, 2=SUR, 3=OESTE
        setCasa(casa);
    }

    private void setCasa(Casa casa) {
        assert casa != null : "Error: la casa no puede ser nula";
        this.casa = casa;
    }

    public void agregar(Puerta p, TipoOrientacion o) {
        assert p != null : "Error: la puerta a agregar no puede ser nula";
        assert o != null : "Error: la orientación no puede ser nula";
        assert !puertasCompletas() : "Error: la habitación no admite más puertas";
        assert !esPuerta(p) : String.format("Error: la puerta %s ya pertenece a la habitación %s", p, this);
        puertas[o.ordinal()] = p;
    }

    public boolean puertasCompletas() {
        for (int i = 0; i < puertas.length; i++)
            if (puertas[i]==null)
                return false;
        return true;
    }

    public Puerta getPuerta(TipoOrientacion o) {
        assert o != null : "Error: la orientación no puede ser nula";
        return puertas[o.ordinal()];
    }

    public boolean esPuerta(Puerta p) {
        assert p != null : "Error: la puerta no puede ser nula";
        for (int i = 0; i < puertas.length ; i++)
            if (puertas[i]==p)
                return true;
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(puertas);
    }
}
