public class Ejemplo3 {
    public static void main(String[] args) {
        int mes = 2;
        int anio = 2000;
        int numeroDias = 0;

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numeroDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numeroDias = 30;
                break;
            case 2:
                if (((anio % 4 == 0) && !(anio%100 == 0)) || (anio % 400 == 0)){
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }
        System.out.println("Numero de dias = " + numeroDias);
    }
}
