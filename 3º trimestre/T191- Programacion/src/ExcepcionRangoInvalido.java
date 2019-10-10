/*
    Excepcion chequeada ya que hereda de exception.
    Necesitan ser capturadas, porque sino el codigo no compila.
 */

public class ExcepcionRangoInvalido  extends Exception{


    public ExcepcionRangoInvalido(String message) {
        super(message);
    }

    public ExcepcionRangoInvalido(String message, Throwable cause) {
        super(message, cause);
    }
}
