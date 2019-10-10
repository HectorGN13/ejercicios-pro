public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 'V' );
        Persona p2 = new Persona("Mari", 'M');

        System.out.println(p1);
        System.out.println(p2);

        p1.casar(p2);

        System.out.println(p1);
        System.out.println(p2);
    }
}
