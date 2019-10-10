public class Principal {
    public static void main(String[] args) {
        Persona persona = null;

        try {
            persona = new Persona("Hector", 60, true);
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        try {
            persona.setGato(new Gato("TOBI"));
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (IllegalStateException e) {
            System.err.println(e);
        }
    }
}
