public class Principal {

    public static void main(String[] args) {

        System.out.println("Hola, soy un Fichero Jar :P");
        if (args.length > 0){
            System.out.println("Tengo argumentos!!");
            for(String arg : args) System.out.println(" Uno de mis argunmentos "+args);
        }
    }
}
