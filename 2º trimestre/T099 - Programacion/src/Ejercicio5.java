public class Ejercicio5 {

    public static void main(String []args){

        System.out.println(nombreDia(8));

    }

    public static String nombreDia(int numDiaSemana) {
        String[] nombres = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String nombre = "Dia incorrecto";
        numDiaSemana -= 1;

        if (numDiaSemana >= 0 && numDiaSemana < nombres.length) {
            nombre = nombres[numDiaSemana];
        }

        return nombre;
    }
}
