public class Principal {

    public static void main(String[] args) {

        Intervalo a = new Intervalo(1, 5);
        Intervalo b = new Intervalo(2, 4);
        Intervalo c = new Intervalo(4,8);
        //Intervalo d = new Intervalo(5,3);
        System.out.println(a.pertenenciaCerrado(4));
        System.out.println(a.inclusion(b));
        System.out.println(a.inclusion(c));
        System.out.println(a.solapamiento(b));
        System.out.println(a.solapamiento(c));
    }


}
