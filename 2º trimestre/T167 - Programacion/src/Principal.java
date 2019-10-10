import java.util.HashSet;

public class Principal {

    /*
    En las unicas colecciones que se usa el hashCode y luego el equals al añadir elementos son en los
    conjuntes o Set ya que tienen una restriccion propia y es que no puede contener elementos repetidos.
     */

    public static void main(String[] args) {
        Persona p1 = new Persona("RIGOBERTO");
        Persona p2 = new Persona("RIGOBERTO");

         HashSet<Persona> cadenas = new HashSet<>();
         cadenas.add(p1);
         cadenas.add(p2);

        //System.out.println(cadenas);

        /*
        Si nos damos cuentas a pesar de que en el codigo hemos indicado que añadamos 2 elementos
        solo ha añadido 1 porque consideraba que el segundo elemento añadido ya estaba incluido.
         */

        //System.out.println(cadenas.contains(new Persona("Juanillo")));

        /*
        si nos fijamos en el codigo de las busquedas
        tambien ya que si por ejemplo nosotros creamos una clase y modificamos el equals y el HashCode o no lo implementamos bien
        nunca encontrará el objeto a buscar.
         */

    }

}
