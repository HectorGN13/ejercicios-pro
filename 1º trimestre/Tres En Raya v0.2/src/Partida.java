import java.util.Scanner;

public class Partida {
    private Jugador jugador1;       // NO NULO, NO MODIFICABLE
    private Jugador jugador2;       // NO NULO, NO MODIFICABLE
    private int turno;              // 1,2
    private Tablero tablero;        // NO NULO, NO MODIFICABLE
    private Jugador ganador;
    private boolean tablas;

    public Partida(String alias1, String alias2) {
        setJugador1(new Jugador(alias1, TipoFicha.O));
        setJugador2(new Jugador(alias2, TipoFicha.X));
        turno = 1;
        setTablero(new Tablero());
        tablas = false;
    }

    private void setJugador1(Jugador jugador) {
        assert jugador != null : "Error: el alias del jugador 1 no puede ser nulo";
        jugador1 = jugador;
    }

    private void setJugador2(Jugador jugador) {
        assert jugador != null : "Error: el alias del jugador 1 no puede ser nulo";
        jugador2 = jugador;
    }

    private void setTurno(int turno) {
        assert turno==1 || turno==2 : String.format("Error: el turno (%d) debe ser 1 o 2", turno);
        this.turno = turno;
    }

    private void cambiarTurno() {
        setTurno(turno==1 ? 2 : 1);
    }

    private void setTablero(Tablero tablero) {
        assert tablero != null : "Error: el tablero no puede ser nulo";
        this.tablero = tablero;
    }

    public void jugar() {
        // TODO: 20/11/2018 MOSTRAR JUGADORES

        //FALLO SI NO METES LA COORDENADA EN UNA POSICION OCUPADA PIERDES EL TURNO!!!
        // FALTA PONER QUIEN ES EL JUGADOR ACTUAL
        // FALTA COMPROBAR QUE HAYA LINEA
        System.out.println("Jugadores");
        System.out.println(jugador1 + " " +jugador2);
        System.out.println("________________");
        System.out.println("");
        System.out.println(tablero);


        do {
            System.out.println(jugadorActual());
            Coordenada c;
            boolean correcto;
            do {
                c = leerCoordenada();
                correcto = tablero.esCoordenada(c);
                if (!correcto)
                    System.out.printf("Coordenada %s incorrecta", c);

            } while (!correcto);

            Jugador jugador = jugadorActual();
            Ficha ficha = new Ficha(jugador.getTipoFicha());

            if (tablero.estaVacia(c)){
                tablero.colocar(ficha, c);
                cambiarTurno();
            } else
                System.out.printf("No es posible colocar la ficha %s en la coordenada %s porque no está vacía\n",
                        ficha, c);

            System.out.println(tablero);


        } while (!esFinJuego());
        mostrarResultado();

    }

    // TODO: 21/11/2018 ES FIN JUEGO
    // DECIDIR EN QUE CLASE VA ESTE METODO (PARTIDA, TABLERO?)
    // Devuelve si el juego ha terminado en tablas o ha ganado un jugador
    private boolean esFinJuego() {
        boolean finjuego = false;

        Coordenada coord11 = new Coordenada(1,1);
        Coordenada coord12 = new Coordenada(1,2);
        Coordenada coord13 = new Coordenada(1,3);
        Coordenada coord21 = new Coordenada(2,1);
        Coordenada coord22 = new Coordenada(2,2);
        Coordenada coord23 = new Coordenada(2,3);
        Coordenada coord31 = new Coordenada(3,1);
        Coordenada coord32 = new Coordenada(3,2);
        Coordenada coord33 = new Coordenada(3,3);

        boolean fila1 = tablero.esLinea(coord11, coord12, coord13);
        boolean fila2 = tablero.esLinea(coord21, coord22, coord23);
        boolean fila3 = tablero.esLinea(coord31, coord32, coord33);

        boolean columna1 = tablero.esLinea(coord11, coord21, coord31);
        boolean columna2 = tablero.esLinea(coord12, coord22, coord32);
        boolean columna3 = tablero.esLinea(coord13, coord23, coord33);

        boolean diagonal1 = tablero.esLinea(coord11, coord22, coord33);
        boolean diagonal2 = tablero.esLinea(coord13, coord22, coord31);

        if (fila1 || fila2 || fila3 || columna1 || columna2 || columna3 || diagonal1 ||diagonal2){
            cambiarTurno();
            ganador = jugadorActual();
            tablas = false;
            finjuego = true;
        } else if (tablero.estaCompleto()){
            ganador = null;
            tablas = true;
            finjuego = true;
        }

        return finjuego;
    }

    //TODO:
    private void mostrarResultado(){
        if (tablas == true){
            System.out.println("Ha terminado la partida en tablas.");
        } else {
            System.out.println("Ganador:");
            System.out.println(ganador);
        }
    }


    private Jugador jugadorActual() {
        return turno==1 ? jugador1 : jugador2;
    }

    private Coordenada leerCoordenada() {
            Scanner scn = new Scanner(System.in);
            int fila;
            int columna;
            System.out.printf("Introduzca la fila: (debe estar comprendida entre %d y %d)", tablero.getMINFILA(), tablero.getMAXFILA());
            fila = scn.nextInt();
            System.out.printf("Introduzca la columna: (debe estar comprendida entre %d y %d)", tablero.getMINCOLUMNA(), tablero.getMAXCOLUMNA());
            columna = scn.nextInt();
            return new Coordenada(fila,columna);
    }
}