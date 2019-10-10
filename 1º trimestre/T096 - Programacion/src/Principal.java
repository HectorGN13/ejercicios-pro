import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
    //    Adivinanza.jugar();
        try {
            Semaforo.printWithDelays(Semaforo.mostrarEstado(10), TimeUnit.MILLISECONDS,40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("");
//        primos(5,1000);
//
//        System.out.println(palabraMaldita("casa", "la casa de la pradera es una casa bonita", "pradera"));
//
     //   System.out.println(new Numeraco(new Cifraca(2), new Cifraca(0), new Cifraca(3)));
    }

    private static void primos(int incio, int fin){
            String resultado = "";
            for (int i = incio; i < fin; i++) {
                int contador = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        contador++;
                }
                if (contador == 2) {
                    if (resultado.isEmpty()) {
                        resultado += i;
                    } else
                        resultado += ", " + i;
                }
            }
            System.out.println(resultado);
    }

    private static int palabraMaldita(String subcadena, String cadena, String palabraMaldita){
        assert !subcadena.isEmpty() : "Error la subcadena a buscar no puede estar vacia";
        assert !cadena.isEmpty() : "Error la cadena sobre la que se va a buscar no puede estar vacia";
        assert !palabraMaldita.isEmpty() : "Error la palabra maldita no puede estar vacia";
        assert subcadena != null : "Error la subcadena no puede ser null";
        assert cadena != null : "Error la cadena no puede ser null";
        assert palabraMaldita != null : "Error la palabra maldita no puede ser null";



        int resultado = 0;
        int limite = 0;
        String aux = "";
        String aux2 = "";
        if (!cadena.contains(palabraMaldita)){
            resultado = 0;
        } else {

            for (int i = 0; i < cadena.length(); i++) {
                aux2 = cadena.substring(i, palabraMaldita.length()+i);
                if (palabraMaldita.equals(aux2)){
                  limite = i;
                  break;
                }
            }
            for (int i = 0; i <= limite; i++) {
                if (cadena.length() == i + subcadena.length()){
                    break;
                }
                aux = cadena.substring(i, subcadena.length()+i);
                if (subcadena.equals(aux)){
                resultado++;
                }
            }
        }

        return resultado;
    }


}


