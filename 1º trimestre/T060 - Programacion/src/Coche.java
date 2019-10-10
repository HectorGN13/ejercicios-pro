/*
 ¿ES POSIBLE SOBRECARGAR CONSTRUCTORES?
    *
    * - Si, siempre y cuando reciban diferente numero de parametros.
*/


public class Coche {

    private int año;
    private String color;
    private String matricula;
    private int puertas;
    private double peso;

    public Coche() {
    }

    public Coche(int año, String color, String matricula) {
        this.año = año;
        this.color = color;
        this.matricula = matricula;
    }

    public Coche(String matricula, int puertas, double peso) {
        this.matricula = matricula;
        this.puertas = puertas;
        this.peso = peso;
    }

    public Coche(int año, String color, String matricula, int puertas, double peso) {
        this.año = año;
        this.color = color;
        this.matricula = matricula;
        this.puertas = puertas;
        this.peso = peso;
    }
}
