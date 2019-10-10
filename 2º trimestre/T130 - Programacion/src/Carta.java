/**
 * @author Hector Saramanbiche
 * @version 1.0
 * @see Baraja
 */
public class Carta {

    private static final String[] NOMBRES = {"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","SOTA","CABALLO","REY"};
    private int numero;
    private TipoPalo palo;

    public Carta(int numero, TipoPalo palo) {
        setNumero(numero);
        this.palo = palo;
    }


    private void setNumero(int numero) {
        assert numero >= 1 && numero <= 7 || numero >= 10 && numero <= 12 : "Error: el numero debe estar comprendido entre 1 y 7 o entre 10 y 12";
        this.numero = numero;

    }

    /**
     * Metodo encargado de generar el nombre de la carta a partir de su numero. este numero se introduce por parametros
     * @param x inteeger introducido por parametro
     * @return devuelve un string con el nombre de la carta.
     */
    private String nombreAutomatico(int x){
        assert x >= 1 && x <= 7 || x >= 10 && x <= 12 : "Error: el numero debe estar comprendido entre 1 y 7 o entre 10 y 12";
        String resultado = "";
        if (x <= 7)
            resultado += NOMBRES[x-1];
        else
            resultado += NOMBRES[x-3];

        return resultado;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombreAutomatico(numero) + '\'' +
                ", numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}