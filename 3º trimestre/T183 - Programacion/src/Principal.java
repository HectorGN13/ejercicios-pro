
/**
 * ¿QUE OCURRE?
 * Que me da error en tiempo de edición y compilacion porque detecta que ya está cazada en la superclase
 */

public class Principal {
    public static void main(String[] args) {
        dividir(10, 0);
    } catch (RuntimeException e) {
        System.err.println("Error: division por cero");
    } catch (ArithmeticException e) {
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
}
