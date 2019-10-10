public class Principal {

    public static void main(String[] args) {
                Robot r1 = new Robot("Pepe",'M');
        Robot r2 = new Robot("Pepillo",'m');
        System.out.println(r1);
        System.out.println(r2);

        r1.saludar("hola");
        r1.girar();

        r1.avanzar(-12);
        System.out.println(r1);
        r1.girar();
        System.out.println(r1);
        r1.girar();
        System.out.println(r1);

    }
}
