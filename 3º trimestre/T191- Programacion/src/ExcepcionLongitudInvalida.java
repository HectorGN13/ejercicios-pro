/*
   Excepcion no chequeadas ya que hereda de runtime.
   No hay necesidad de capturarlas, es decir que no se necesita utilizar el bloque try/catch.
 */

public class ExcepcionLongitudInvalida extends RuntimeException {

    public ExcepcionLongitudInvalida(String message) {
        super(message);
    }

    public ExcepcionLongitudInvalida(String message, Throwable cause) {
        super(message, cause);
    }
}
