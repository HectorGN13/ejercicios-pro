public class Principal {

    public static void main(String[] args) {

        Diccionario d1 = new Diccionario(5);
        Palabra p1 = new Palabra("home", "hogar");
        Palabra p2 = new Palabra("table", "mesa");
        Palabra p3 = new Palabra("chair", "silla");
        Palabra p4 = new Palabra("country", "pais");
        Palabra p5 = new Palabra("mouse", "raton");
        System.out.println(p1);
        System.out.println(d1);

        d1.agregar(p1);
        d1.agregar(p2);
        d1.agregar(p3);
        d1.agregar(p4);
        d1.agregar(p5);
        System.out.println(d1);
        d1.ordenar();
        System.out.println(d1);

        d1.eliminar(p3);
        d1.eliminar(p1);
        System.out.println(d1);

        System.out.println(d1.palabra(1));
        System.out.println(d1.palabra(10));


    }
}
