import java.util.concurrent.TimeUnit;

public final class Semaforo {



    private Semaforo() {

    }

    public static String mostrarEstado(int veces){
        String red="\033[31m";
        String green="\033[32m";
        String yellow="\033[33m";
        String reset="\u001B[0m";

        String resultado = red+TipoColor.ROJO.toString()+reset;
        for (int i = 0; i < veces; i++) {
            TipoColor estados[] = TipoColor.values();
            switch (i%TipoColor.values().length){
                case 0:
                    resultado += "-->"+green+estados[0].toString()+reset;
                    break;
                case 1:
                    resultado += "-->"+yellow+estados[1].toString()+reset;
                    break;
                case 2:
                    resultado += "-->"+red+estados[2].toString()+reset;
                    break;
                default:
                    System.err.print("Error programacion");
                    break;
            }
        }
        return resultado;
    }


    public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }

    private enum TipoColor{
        VERDE,AMARILLO,ROJO;
    }
}
