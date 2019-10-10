public final class Salida {

    public Salida() {
    }


    public static void mostrarPeticionNombre(){
        System.out.println("Introduzca el nombre por favor: (Recuerda que no puede estar vacio.)");
    }

    public static void mostrarOpcionIncorrecta(){
        System.out.println("Ha elegido usted una opcion incorrecta. Por favor vuelva a intentarlo");
    }

    public static void mostrarPeticionApellido(){
        System.out.println("Introduzca el apellido por favor: (Recuerda que no puede estar vacio.)");
    }

    public static void mostrarPeticionFecha(){
        System.out.println("Introduzca la fecha de nacimiento por favor:");
    }

    public static void mostrarPeticionColorOjos(){
        System.out.println("Por favor elija una opcion para el color de los ojos");
        System.out.println("1) NEGRO");
        System.out.println("2) AZUL");
        System.out.println("3) VERDE");
        System.out.println("4) MARRON");
        System.out.println("5) GRIS");
    }

    public static void mostrarSexo(){
        System.out.println("Por favor introduzca el sexo (M|F):");
    }

    public static void mostrarNumeroPersonasGeneradas(){
        System.out.println(Banco.getContador());
    }

    public static void mostrarAbuelo(Persona p){
        if (p.getPadre().getPadre() != null){
            System.out.println(p.getPadre().getPadre());
        } else
            System.out.println(p.getAlias() + " no tiene abuelo.");
    }
}
