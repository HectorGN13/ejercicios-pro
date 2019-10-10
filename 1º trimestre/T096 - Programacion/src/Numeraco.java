
public class Numeraco {


    private Cifraca centenas;
    private Cifraca decenas;
    private Cifraca unidades;

    public Numeraco(Cifraca centenas, Cifraca decenas, Cifraca unidades) {
        this.centenas = centenas;
        this.decenas = decenas;
        this.unidades = unidades;
    }



    @Override
    public String toString() {
        String[] centenas = this.centenas.toString().split("\n");
        String[] decenas = this.decenas.toString().split("\n");
        String[] unidades = this.unidades.toString().split("\n");

        String resultado = "";

        for (int i = 0; i < 5; i++) {
            resultado += centenas[i]+"□"+decenas[i]+"□"+unidades[i]+"\n";
        }
        return resultado;
    }


}
