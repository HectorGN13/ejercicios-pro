import java.util.StringTokenizer;

public class Principal {

    public static void main(String[] args) {

        String a1 = "vaca,pollo,galera,acedia,pijota,langostino,chirla";
        Animal[] animals = devolverArray(a1);
        for (Animal x:animals) {
            System.out.println(x);
        }
    }

    public static Animal[] devolverArray(String animales){
        assert animales != null : "Error: la cadena introducida no puede ser null";
        StringTokenizer a1 = new StringTokenizer(animales, ",");
        Animal[] resultado = new Animal[a1.countTokens()];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = new Animal(a1.nextToken());
        }
        return resultado;
    }
}
