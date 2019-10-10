public final class Salida {

    private Salida() {
    }


    public static void mostrar(String mensaje){
        System.out.print(mensaje);
    }

    public static void mostrarSl(String mensaje){
        System.out.println(mensaje);
    }

    public static void mostrarError(String mensaje){
        System.err.println(mensaje);
        System.out.println("");
        log(mensaje);
    }

    public static void log(String mensaje){
        System.out.printf("%s ha sido guardado en el cuaderno de vitacora.", mensaje);
    }


}
