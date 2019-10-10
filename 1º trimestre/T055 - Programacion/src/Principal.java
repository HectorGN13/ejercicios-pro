public class Principal {

    public static void main(String[] args) {

    }

    public static void metodoStatico(){
        metodoStatico();
        metodoNoStatic();
    }

    public void metodoNoStatic(){
        metodoStatico();
        metodoNoStatic();
    }
}
