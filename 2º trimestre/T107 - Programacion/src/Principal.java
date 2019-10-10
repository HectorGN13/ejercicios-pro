public class Principal {

    public static void main(String[] args) {
        int numeros[] = {6, 5, 4, 7, 8};
        double pesos[] = {0.2, 0.2, 0.15, 0.15, 0.3};

        System.out.println("La media ponderada es: "+mediaPonderada(numeros, pesos));
    }

    public static double mediaPonderada(int[] n, double[] p) {

        assert n != null : "Error: el array numeros no puede ser null";
        assert p != null : "Error: el array pesos no puede ser null";
        assert n.length >= 1 : "Error: el array numeros debe tener al menos un valor";
        assert p.length >= 1 : "Error: el array pesos debe tener al menos un valor";
        assert n.length == p.length :  "Error: los arrays deben tener la misma longitud";

        double suma = 0;

        for (int i = 0; i < p.length; i++) {
            suma += p[i];
        }

        assert suma == 1.00 : "La suma de los pesos debe dar como resultado 1.00";

        double resultadoNumero = 0;
        for (int i = 0; i < n.length; i++) {
            resultadoNumero += n[i]*p[i];
        }
        return resultadoNumero;
    }
}
