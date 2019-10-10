public class Principal {

    public static void main(String[] args)  {

        try (Persona p = new Persona("Hector")) {

            p.setAlias("Eduardo");
            System.out.println(p);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
