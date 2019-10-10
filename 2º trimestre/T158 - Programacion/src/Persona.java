public class Persona {

    private String alias;

    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: las personas deben tener un nombre";
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
