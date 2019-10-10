/*
¿QUE OCURRE EN EL CASO DE CAZAR UNA CLASE Y UNA SUBCLASE EXCEPCION EN LA MISMA LINEA DE LA CLAUSULA CATCH?
que da error en tiempo de edicion y de compilacion porque detecta que Arithmetic es una subclase de runtimeException.
 */
public class Principal {
    public static void main(String[] args) {
        try {
            dividir(10, 0);
        } catch (RuntimeException | ArithmeticException e) {
            System.err.println("Error: division por cero");
        }
    }

    /**
     * División
     *
     * @param numerador   numerador
     * @param denominador denominador
     * @return resultado de la división
     * @throws ArithmeticException si la division es por 0
     */
    private static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0)
            throw new ArithmeticException();
        return numerador / denominador;
    }
}
