public class Militar implements Comparable<Militar> {

    private String alias;
    private int peso;
    private TipoRango rango;


    public Militar(String alias, int peso, TipoRango rango) {
        setAlias(alias);
        this.peso = peso;
        setRango(rango);
    }

    public String getAlias() {
        return alias;
    }

    public int getPeso() {
        return peso;
    }

    public TipoRango getRango() {
        return rango;
    }

    public void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        this.alias = alias;
    }

    public void setPeso(int peso) {
        assert peso > 40 : "Error: un militar no puede ser un canijo";
        this.peso = peso;
    }

    public void setRango(TipoRango rango) {
        assert rango != null : "Error: el rango no puede ser nulo";
        this.rango = rango;
    }

    @Override
    public int compareTo(Militar o) {
        return rango.compareTo(o.rango);
    }

    @Override
    public String toString() {
        return "Militar{" +
                "alias='" + alias + '\'' +
                ", peso=" + peso +
                ", rango=" + rango +
                '}';
    }
}
