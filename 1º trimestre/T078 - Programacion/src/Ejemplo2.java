public class Ejemplo2 {

    public static void main(String[] args) {
        java.util.ArrayList<String> mesesFuturos = new java.util.ArrayList<String>();

        int mes = 8;

        switch (mes){
            case 1: mesesFuturos.add("Enero");
            case 2: mesesFuturos.add("Febrero");
            case 3: mesesFuturos.add("Marzo");
            case 4: mesesFuturos.add("Abril");
            case 5: mesesFuturos.add("Mayo");
            case 6: mesesFuturos.add("Junio");
            case 7: mesesFuturos.add("Julio");
            case 8: mesesFuturos.add("Agosto");
            case 9: mesesFuturos.add("Septiembre");
            case 10: mesesFuturos.add("Octubre");
            case 11: mesesFuturos.add("Noviembre");
            case 12: mesesFuturos.add("Diciembre");
                    break;
            default: break;
        }

        if (mesesFuturos.isEmpty()){
            System.out.println("Numero de mes invalido");
        } else {
            for (String meses : mesesFuturos) {
                System.out.println(meses);
            }
        }
    }
}
