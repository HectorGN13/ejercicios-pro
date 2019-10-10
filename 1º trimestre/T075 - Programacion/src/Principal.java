public class Principal {

    public static void main(String[] args) {
        MiConsole.println(MiConsole.ANSI_RED, "Texto rojo");
        MiConsole.println(MiConsole.ANSI_BLUE, "Texto azul");
        String txtVerde = MiConsole.getStringInColor(MiConsole.ANSI_GREEN, "Texto verde");
        System.out.println(txtVerde);
    }
}
