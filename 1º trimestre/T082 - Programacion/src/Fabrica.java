import java.util.Random;

public class Fabrica {

    private Fabrica() {}

    public static Personaje generarPersonaje(String alias) {
        Random r = new Random();
        Personaje p = new Personaje(    alias,
                r.nextBoolean(),     // Gafas
                r.nextBoolean(),     // Fuma
                r.nextBoolean(),     // Sombrero
                generarColorPelo(),  // Color pelo
                'V');                // Genero

        return p;
    }

    private static TipoColorPelo generarColorPelo() {
        Random r = new Random();

        int numero = r.nextInt(4) + 1;

        switch (numero) {
            case 1:     return TipoColorPelo.AMARILLO;
            case 2:     return TipoColorPelo.BLANCO;
            case 3:     return TipoColorPelo.NEGRO;
            case 4:     return TipoColorPelo.ROJO;
            default:    assert false: "Error al generar el color de pelo";
                return null;
        }
    }
}