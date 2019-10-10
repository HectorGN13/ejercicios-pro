public class Principal {

    public static void main(String[] args) {
        //Ejercicio 1
        int radio=2;
        System.out.println(2*Math.PI*radio);
        //Ejercicio 2
        System.out.println(2*Math.PI*Math.pow(radio,2));
        //Ejercicio 3
        double a = 7;
        double b = 2;
        double c = 3;
        System.out.println(Math.pow(a,2)+(Math.pow(b,2)/c));
        //Ejercicio 4
        System.out.println((-b)+(Math.sqrt((Math.pow(b,2))-(4*a*c))/(2*a)));
        //El resultado da NaN porque estoy intentado hacer la raiz cuadrada de un numero negativo y eso no se puede hacer.
    }
}
