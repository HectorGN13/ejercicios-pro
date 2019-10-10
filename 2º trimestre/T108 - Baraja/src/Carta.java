public class Carta {

    private String nombre;
    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        setNumero(numero);
        this.palo = palo;
        nombre = nombreAutomatico(numero);
    }

    private void setNumero(int numero) {
        assert numero >= 1 && numero <= 7 || numero >= 10 && numero <= 12 : "Error: el numero debe estar comprendido entre 1 y 7 o entre 10 y 12";
        this.numero = numero;

    }

    private String nombreAutomatico(int x){
        String resultado = "";
        switch (x){
        case 1:
            resultado = "AS";
            break;
        case 2:
            resultado = "DOS";
            break;
        case 3:
            resultado = "TRES";
            break;
        case 4:
            resultado = "CUATRO";
            break;
        case 5:
            resultado = "CINCO";
            break;
        case 6:
            resultado = "SEIS";
            break;
        case 7:
            resultado = "SIETE";
            break;
        case 10:
            resultado = "SOTA";
            break;
        case 11:
            resultado = "CABALLO";
            break;
        case 12:
            resultado = "REY";
            break;
        default:
            assert false : "Error de programacion";
            break;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}
