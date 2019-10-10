public class Baraja {

    private Carta[] baraja = new Carta[40];

    public Baraja() {
        generarCartas();
    }

    private void generarCartas(){
        int continuacion = 0;
        int j = 0;
        for (TipoPalo palote: TipoPalo.values()) {
            for (j = 1; j <=10 ; j++) {
                if (j > 7 ){
                    baraja[j-1+continuacion] = new Carta(j+2, palote);
                } else {
                    baraja[j-1+continuacion] = new Carta(j,palote);
                }
            }
            continuacion = continuacion+j-1;
        }
    }

    public void mostrarBaraja(){
        for (Carta carta: this.baraja) {
            System.out.println(carta);
        }
    }
}
