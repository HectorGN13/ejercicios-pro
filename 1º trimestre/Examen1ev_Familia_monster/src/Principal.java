import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        Persona p1 = b1.generarPersonaParametros("juan", "dean", 'M', 1990, 1990);
        //Persona p2 = b1.generarPersonaPidiendoDatos();
        Persona p2 =  b1.generarPersonaParametros("pepe", "dean", 'M', 1820, 1950);
        Persona p3 = b1.generarPersonaParametros("Jose","dean", 'M', 1800, 1820);
        p1.asignarPadre(p2);
        p2.asignarPadre(p3);
        System.out.println(p1);
        System.out.println(p2);
        Salida.mostrarAbuelo(p1);
        Salida.mostrarNumeroPersonasGeneradas();


    }
}
