public class Principal {

    public static void main(String[] args) {
        Casa c1 = new Casa(2,2);

        Puerta p1 = new Puerta(false);

        Habitacion h1 = new Habitacion(c1);
        Habitacion h2 = new Habitacion(c1);
        Habitacion h3 = new Habitacion(c1);
        Habitacion h4 = new Habitacion(c1);


        h1.agregar(p1,TipoOrientacion.NORTE);
        h2.agregar(p1, TipoOrientacion.SUR);
        //h3.agregar(p1,TipoOrientacion.ESTE);
    }
}
