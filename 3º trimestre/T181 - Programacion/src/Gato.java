public class Gato {
    private String alias;   // NN, NM

    /**
     * Constructor de Gato
     *
     * @param alias                     alias del gato que no puede ser nulo
     * @throws NullPointerException     si el alias del gatos es nulo
     */
    public Gato(String alias) throws NullPointerException {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        if (alias == null)
            throw new NullPointerException("Error: el alias de un gato no puede ser nulo");
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
