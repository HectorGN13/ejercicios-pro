public class Ficha {
    private TipoFicha tipo;     // NO NULO, NO MODIFICABLE

    public Ficha(TipoFicha tipo) {
        setTipo(tipo);
    }

    private void setTipo(TipoFicha tipo) {
        assert tipo != null : "Error: el tipo de ficha no puede ser nulo";
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o instanceof Ficha){
            Ficha f = (Ficha)o;
            return f.tipo.equals(this.tipo);
        }
        return false;
    }

    @Override
    public String toString() {
        return tipo.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}