public class Jugador {
    private String alias;           // NO NULO , NO VACIO, NO MODIFICABLE
    private TipoFicha tipoFicha;    // NO NULO, NO MODIFICABLE

    public Jugador(String alias, TipoFicha tipoFicha) {
        setAlias(alias);
        setTipoFicha(tipoFicha);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede estar vacio";
        this.alias = alias;
    }

    private void setTipoFicha(TipoFicha tipoFicha) {
        assert tipoFicha != null : "Error: el tipo de ficha no puede ser nulo";
        this.tipoFicha = tipoFicha;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    @Override
    public String toString() {
        return alias + " === " + tipoFicha;
    }
}