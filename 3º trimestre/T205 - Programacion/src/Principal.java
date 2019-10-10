public class Principal {


    public static void main(String[] args) {

        Escritura.openFile();
        Escritura.inicializarAnimales();
        Escritura.closeFile();

        Lectura.abrirFichero();
        Lectura.mostrar();
        Lectura.cerrarFichero();


    }

}

