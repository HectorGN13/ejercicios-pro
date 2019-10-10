public class Ejercicio3 {

    public static void main(String[] args){

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numeroElementos = diasMes.length;
        int anioBisiesto = 29;
        int anio = 0;

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            diasMes[1] = anioBisiesto;
        }


    }

}
