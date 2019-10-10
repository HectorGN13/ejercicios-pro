public class Ejercicio6 {

    public static void main(String [] args){
        double[] notas = {3.5, 5.7, 7.7, 4.2, 8.1, 9.3, 2.6};
        System.out.println(media(notas));
    }

    public static double media(double[] notas) {

        double suma = 0.0;
        for (int i = 0; i < notas.length; i++)
            suma += notas[i];

        return suma / notas.length ;

    }
}
