public class Principal {

    public static void main(String[] args) {
        Cajero c1 = new Cajero();
        c1.quierePagar(new Persona("HECTOR"));       // es el primero en entrar en la cola
        c1.quierePagar(new Persona("PEPE"));
        c1.quierePagar(new Persona("MARIA"));
        c1.quierePagar(new Persona("JOSECA"));

        c1.mostrar();

        System.out.println("--------------------");
        c1.pagar();
        c1.mostrar();

        System.out.println("--------------------");
        c1.pagar();
        c1.mostrar();
        System.out.println("El siguiente en pagar es:"+c1.siguiente());


    }
}
