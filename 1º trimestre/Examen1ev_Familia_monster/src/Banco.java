import java.util.Random;

public class Banco {

    private static int contador;

    //Constructor

    public Banco() {
    }

    //Otros Metodos

    public Persona generarPersonaParametros(String alias, String apellido, char sexo, int anioMin, int anioMax){
        contador++;
        return new Persona(alias.toUpperCase(), apellido.toUpperCase(), sexo, generarFecha(anioMin,anioMax), generarColorOjos());

    }

    public Persona generarPersonaPidiendoDatos(){

        char sexo;
        String colorOjos = "";
        boolean opcion = false;
        boolean correcto2 = false;
        do {
            Salida.mostrarSexo();
            sexo = Entrada.leerString().toUpperCase().charAt(0);
            if (sexo == 'M' || sexo == 'F'){
                opcion = true;
            } else {
                Salida.mostrarOpcionIncorrecta();
            }
        } while (!opcion);

        Salida.mostrarPeticionNombre();
        String nombre = Entrada.leerString();
        Salida.mostrarPeticionApellido();
        String apellido = Entrada.leerString();
        Salida.mostrarPeticionFecha();
        int anioNac = Entrada.leerEntero();
        do {
            Salida.mostrarPeticionColorOjos();
            int numero = Entrada.leerEntero();
            switch (numero){
                case 1:
                    colorOjos = "NEGRO";
                    correcto2 = true;
                    break;
                case 2:
                    colorOjos = "AZUL";
                    correcto2 = true;
                    break;
                case 3:
                    colorOjos = "VERDE";
                    correcto2 = true;
                    break;
                case 4:
                    colorOjos = "MARRON";
                    correcto2 = true;
                    break;
                case 5:
                     colorOjos = "GRIS";
                     correcto2 = true;
                     break;
                default:
                    Salida.mostrarOpcionIncorrecta();
                    break;
            }
        } while (!correcto2);
        contador++;
        return new Persona(nombre.toUpperCase(), apellido.toUpperCase(), sexo, anioNac, colorOjos.toUpperCase());
    }

    private int generarFecha(int x, int y){
        assert x <= y : String.format("Error: el minimo del intervalo (%d), no puede ser mayor que el max(%d).",x,y);
        Random rnd = new Random();
        return x+rnd.nextInt((y+1)-x);
    }

    private String generarColorOjos(){
       int numero = generarFecha(1, 5);
       String colorOjos = "";
       switch (numero){
            case 1:
                colorOjos = "AZUL";
                break;
            case 2:
                colorOjos = "VERDE";
                break;
           case 3:
               colorOjos = "NEGRO";
               break;
           case 4:
               colorOjos = "GRIS";
               break;
           case 5:
               colorOjos = "MARRON";
               break;
           default:
               assert false : "Error de programacion";
               break;
       }
       return colorOjos;
    }

    //Getters

    public static int getContador() {
        return contador;
    }
}
