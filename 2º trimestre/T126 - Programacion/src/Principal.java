public class Principal {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("El usuario no tiene hijos");
        } else {
            Persona[] hijos = new Persona[args.length];
            for (int i = 0; i < hijos.length; i++) {
                hijos[i] = new Persona(args[i]);
            }
            mostrar(hijos);
        }
    }

    private static void mostrar(Persona[] hijos) {
        for (Persona x:hijos) {
            System.out.println(x);
        }
    }
}
