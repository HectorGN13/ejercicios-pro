public class Principal {

    public static void main(String[] args) {
        Robot r1 = new Robot("Pepe",'M', 10);
        //Robot r2 = new Robot("Pepillo",'m',10);
        Bateria b1 = new Bateria(100, 10);
        r1.acoplarBateria(b1);
        System.out.println(r1);
        //System.out.println(r2);

        r1.saludar("hola");
        r1.girar();

        r1.avanzar(12);
        System.out.println(r1);
        r1.girar();
        System.out.println(r1);
        r1.girar();
        System.out.println(r1);

    }
}
