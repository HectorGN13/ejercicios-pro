import java.util.Random;

public class Bola {

    private int numero;             // >=1 && auto && unico.
    private static int contador;    // >=0
    private TipoColor color;        // not null
    private boolean colocada;



    public Bola(TipoColor color) {
        incContador();
        setNumero(contador);
        setColor(color);
        colocada = false;
    }

    private void setNumero(int numero) {
        assert numero >= 1 : String.format("Error: el numero %n no puede ser null", numero);
        this.numero = numero;
    }

    private void incContador() {
        contador++;
    }

    private void setContador(int contador) {
        assert contador >= 0 : String.format("Error: el contador %n debe de ser mayor o igual de 0", contador);
        this.contador = contador;
    }

    private void setColor(TipoColor color) {
        assert color != null : "Error el color no puede ser null";
        this.color = color;

    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public boolean estaColocada() {
        return colocada;
    }
    public String toString() {
        return "Bola "+numero+" ("+color+")";
    }

    public static Bola generar(){
        Random rnd = new Random();
        int aleatorio = rnd.nextInt(TipoColor.values().length);
        TipoColor[] colores = TipoColor.values();
        return new Bola(colores[aleatorio]);
    }

    public static Bola generar2(){
        Random rnd = new Random();
        int aleatorio = rnd.nextInt(TipoColor.values().length);
        Bola bola = null;
        switch (aleatorio){
            case 1:
                bola = new Bola(TipoColor.AMARILLO);
                break;
            case 2:
                bola = new Bola(TipoColor.AZUL);
                break;
            case 3:
                bola = new Bola(TipoColor.BLANCO);
                break;
            case 4:
                bola = new Bola(TipoColor.ROJO);
                break;
            case 5:
                bola = new Bola(TipoColor.NEGRO);
                break;
            case 6:
                bola = new Bola(TipoColor.VERDE);
                break;
            default:
                System.err.println("Error TipoColor Invalido");

        }
        return bola;

    }
}

