public class Principal {
    public static void main(String[] args) {


	    // 1/0 (DIVISION ENTERA)
        //System.out.println(divisionEntera(1,0));

        // -0/0 (DIVISION ENTERA)
        //System.out.println(divisionEntera(-0,0));

        // 0.0/0.0 (DIVISION REAL - FLOAT)
        System.out.println(Float.isNaN(divisionReal(0.0F, 0.0F)));

        // 0.0/-0.0 (DIVISION REAL - FLOAT)
        System.out.println(Float.isInfinite(divisionReal(-0.0F, 0.0F)));


    }

    private static int divisionEntera(int numerador, int denominador) {
        return numerador / denominador;
    }

    private static float divisionReal(float numerador, float denominador) {
        return numerador / denominador;
    }

    private static double divisionReal(double numerador, double denominador) {
        return numerador / denominador;
    }
}
