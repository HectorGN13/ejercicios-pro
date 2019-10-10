public class Persona implements AutoCloseable{

    private String alias;                    // NO NULO, NO VACIO

    public Persona(String alias) {
        setAlias(alias);
    }

    public void setAlias(String alias) {
        if (alias == null)
            throw new NullPointerException("Errror: el alias no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias recibido no puede estar vacio");
        this.alias = alias;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Se ha ejecutado el metodo close() ");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "alias='" + alias + '\'' +
                '}';
    }
}