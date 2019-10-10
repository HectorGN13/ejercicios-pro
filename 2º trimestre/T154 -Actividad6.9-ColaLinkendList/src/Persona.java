public class Persona {

    private String alias;                  // No nulo, No modificable;

    public Persona(String alias){
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias recibido no puede ser nulo";

        this.alias = alias;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "alias='" + alias + '\'' +
                '}';
    }
}
