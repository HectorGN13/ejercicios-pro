import java.util.Random;

public class Robot {

    ////////////////
    //ATRIBUTOS/////
    ////////////////
    private static final String ORIENTACIONES = "NESO";
    private static final String GENERACIONES = "ABM";
    private int numeroSerie;                // >=1
    private static int contador = 0;
    private String alias;                   // Not null, not vacio, no modificable.
    private char generacion;                // A, B, M
    private char orientacion;               // N, S, E, O
    private int distanciaRecorrida;         // >=0
    private Bateria bateria;                // <<R>>
    private static final int CONSUMOAVANZAR = 2;
    private int peso;

    ///////////////////
    //CONSTRUCTORES////
    ///////////////////


    /**
     * Constructor de la clase Robot
     * Necesita como parametros el alias, la generacion.
     * Cada vez que se cree un robot se le asignara automaticamente un numero de serie auto-incrementado,
     * y la distancia de cada robot se inicializa por defecto en 0 siempre que se construye un robot.
     * @param alias String nombre del robot.
     * @param generacion    generacion solo puede ser 'A','B' o 'M'
     */
    public Robot(String alias, char generacion, int peso) {
        setNumeroSerie(++contador);
        setAlias(alias);
        setGeneracion(Character.toUpperCase(generacion));
        setOrientacion(aleatoriedadOrientacion());
        this.distanciaRecorrida = 0;
        setPeso(peso);
        setBateria(null);
    }

    ////////////////
    //MUTADORES////
    ///////////////

    /**
     * Mutador para el parametro
     * @param numeroSerie Nº identificador del robot
     */
    private void setNumeroSerie(int numeroSerie) {
        assert numeroSerie != 0 : "Error el numero de serie empieza por 1";
        this.numeroSerie = numeroSerie;
    }

    /**
     * Mutador para el Alias
     * El alias nunca puede cambiar.
     * @param alias El nombre del robot
     */
    private void setAlias(String alias) {
        assert alias != null : "Error el alias no puede ser Null";
        assert !alias.isEmpty() : "Error el alias no puede estar vacio";
        this.alias = alias;
    }

    /**
     * Mutador para la generacion del robot
     * La generacion solo tiene 3 posibles parametros 'A', 'B' y 'M'
     * @param generacion Generacion a la que pertenece el robot.
     */
    private void setGeneracion(char generacion) {
        assert GENERACIONES.indexOf(generacion) >= 0 : "Error no puede pertenecer a esa generacion."  ;
        this.generacion = generacion;
    }

    /**
     * Mutador para la orientacion.
     * Con este metodo podemos cambiar la orientacion del robot
     * @param orientacion La direccion a la que apunta el robot.
     */
    private void setOrientacion(char orientacion) {
        //assert orientacion == 'N' || orientacion == 'S' || orientacion == 'E' || orientacion == 'O';
        assert ORIENTACIONES.indexOf(orientacion) >= 0 : "Error la orientacion es incorrecta se le deberia de pasar (NESO)";
        this.orientacion = orientacion;
    }

    /**
     * Mutador para el peso.
     * Con este metodo se cambia el atributo peso.
     * @param peso
     */
    private void setPeso(int peso) {
        this.peso = peso;
    }


    /**
     * Mutador que modifica el parametro de la distancia recorrida
     * La distancia recorrida no puede ser un numero negativo.
     * @param distanciaRecorrida numero entero que representa la distancia recorrida en metros por el robot.
     */
    private void setDistanciaRecorrida(int distanciaRecorrida) {
        assert distanciaRecorrida > 0 : "Error: la distancia recorrida no puede ser negativa";
        this.distanciaRecorrida = distanciaRecorrida;
    }

    /**
     * Mutador para el atributo bateria.
     * @param bateria
     */
    private void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    //////////////////
    //ACCESORES//////
    /////////////////


    /**
     * Accesor para obtener la orientacion del Robot.
     * @return El parametro orientaciacion un char que representa los 4 puntos cardinales ('N','S','E' y 'O').
     */
    public char getOrientacion() {
        return orientacion;
    }

    /**
     * Accesor para obtener la distancia recorrida del Robot.
     * @return El parametro distanciaRecorrida.
     */
    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public Bateria getBateria() {
        return bateria;
    }


    //METODOS AUXILIARES

    /**
     * Metodo privado que nos genera una orientacion aleatoria.
     */
    private char aleatoriedadOrientacion(){
        Random rnd = new Random();
        return "NESO".charAt(rnd.nextInt(ORIENTACIONES.length()-1));
    }

    /**
     * Metodo publico que modifica el estado del atributo orientacion.
     * Cambia la orientacion en sentido de las agujas del reloj.
     */
    public void girar(){
/*        switch (getOrientacion()){
            case 'N' :
                setOrientacion('E');
                break;
            case 'E':
                setOrientacion('S');
                break;
            case 'S':
                setOrientacion('O');
                break;
            case 'O':
                setOrientacion('N');
                break;
        }*/

        int inicio = ORIENTACIONES.indexOf(getOrientacion());
        inicio++;
        inicio %= ORIENTACIONES.length();
        setOrientacion(ORIENTACIONES.charAt(inicio));
    }


    /**
     * Metodo que devuelve un codigo generado a traves de una concatenacion entre el numero de serie y la generacion
     * @return el codigo compuesto (Nº de serie + generacion) del robot.
     */
    private String codigo(){
        return String.valueOf(numeroSerie)+generacion;
    }

    /**
     * Muestra por pantalla un mensaje saludo del robot.
     */
    public void saludar(String texto){
        System.out.printf(texto + " mi codigo es %s y mi nombre es %s\n", codigo(), alias);
    }

    /**
     * Metodo para acoplar una bateria.
     * @param bateria
     */
    public void acoplarBateria(Bateria bateria){
        assert this.bateria == null : "Error: La bateria ya esta acoplada.";
        this.bateria = bateria;
        setPeso(bateria.getPeso());
    }

    /**
     * Metodo para desacoplar bateria.
     * @return devuelve la bateria acoplada en el caso que no tenga bateria devolvera null
     */
    public Bateria desacoplarBateria(){
        if (getBateria() == null){
            System.err.println("Error: no hay baterias acopladas");
            return null;
        } else {
            setBateria(null);
            return getBateria();
        }
    }

    /**
     * Mutador que modifica el parametro de la distancia recorrida,
     * es un calculo entre la distancia obtenida actual + la distanciaRecorrida que pasamos por parametro.
     * @param distanciaRecorrida numero entero que representa la distancia recorrida en metros por el robot.
     */
    public void avanzar(int distanciaRecorrida) {
        if (bateria != null){
        int distancia = getDistanciaRecorrida() + distanciaRecorrida;
        setDistanciaRecorrida(distancia);
        getBateria().descargarBateria(distanciaRecorrida*CONSUMOAVANZAR);
        } else {
            System.err.println("Error el robot no puede avanzar");
        }
    }

    /**
     * Metodo que representa graficamente un robot por pantalla.
     * @return Devuelve la representacion grafica de un robot
     */
    @Override
    public String toString() {
        return "Robot{" +
                "numeroSerie=" + numeroSerie +
                ", alias='" + alias + '\'' +
                ", generacion=" + generacion +
                ", orientacion=" + (getOrientacion() == 'N' ? "NORTE"
                : getOrientacion() == 'S' ? "SUR"
                : getOrientacion() == 'E' ? "ESTE"
                : getOrientacion() == 'O' ? "OESTE" : "") +
                ", distanciaRecorrida=" + distanciaRecorrida +
                ", bateria=" + getBateria().toString() +
                ", peso=" + peso +
                ", porcentaje Bateria=" + getBateria().getCarga() +
                '}';
    }
}
