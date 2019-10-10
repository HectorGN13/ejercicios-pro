public class Principal {

    public static void main(String[] args) {

    }

    private static int turno = 0;

    public static void cambiarTurno() {
        //turno = 1-turno;
        if (turno==1){
            turno=0;
        } else{
            turno=1;
        }
    }

    public static int cambiarTurno(int jugadores[]){
        turno++;
        turno %= jugadores.length;
        return turno;
    }
}
