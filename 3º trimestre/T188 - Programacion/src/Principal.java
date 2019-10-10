/*
No solo en los casos en que cuando se produzca la excepcion funcionen en la ejecucion completa del programa por lo que
dicho programa no deberia iniciarse. ejemplo si tenemos un programa en el que solo uno de los botones falla y el resto del
programa es estable no seria necesario.
 */
public class Principal {
    public static void main(String[] args) {
        try {
            Persona p = generar("PACO", -10);
            System.out.println(p);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static Persona generar(String alias, int peso) throws NullPointerException, IllegalArgumentException {
        if (alias == null) {
            throw new NullPointerException("Error: el alias no puede ser nulo");
        }
        Persona p = new Persona(alias);

        try {
            p.setPeso(peso);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
        return p;
    }
}
