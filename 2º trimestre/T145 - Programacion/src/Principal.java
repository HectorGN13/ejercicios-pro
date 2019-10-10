public class Principal {


    public static void main(String[] args) {

        Personaje p1 = new Personaje("Alfredo");
        Personaje p2 = new Personaje("Ramiro");
        Personaje p3 = new Personaje("Rigoberta");
        Personaje p4 = new Personaje("Antuan");
        Personaje p5 = new Personaje("Antoñeta");
        Personaje p6 = new Personaje("Fari");

        Personaje[] arrayPersonajes = {p1,p2,p3,p4,p5};

        System.out.println(buscarPersonaje(arrayPersonajes,p6));
        System.out.println(buscarPersonaje(arrayPersonajes,p5));
    }


    public static boolean buscarPersonaje(Personaje[] arrayPersonajes, Personaje personaje){
        boolean result = false;
        for (Personaje arrayPersonaje : arrayPersonajes) {
            if (arrayPersonaje.equals(personaje)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
