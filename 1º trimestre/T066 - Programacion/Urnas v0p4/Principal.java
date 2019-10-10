import java.util.Scanner;

public class Principal
{
    private static Urna urna;
    private static Bola bola;
    private static final String COLORES = "AMARILLO, AZUL, BLANCO, NEGRO, ROJO, VERDE";
    
    public static void main(String[] args) {
        menu(); 
        System.out.println("¡¡¡Fin del programa Urnas!!!");
    }
    
    private static void menu() {
        final String OPCIONES = "01234567";
        char opcion = ' ';
 
        System.out.println("MENU");
        System.out.println("----");        
        System.out.println("0) SALIR");    
        System.out.println("1) CREAR URNA");    
        System.out.println("2) CREAR BOLA");    
        System.out.println("3) AGREGAR UNA BOLA A LA URNA");    
        System.out.println("4) AGREGAR VARIAS BOLAS (GENERADAS AUTOMATICAMENTE) A LA URNA ");
        System.out.println("5) EXTRAER VARIAS BOLAS DE URNA DE UN COLOR ESPECIFICADO POR EL USUARIO");   
        System.out.println("6) VACIAR URNA");        
        System.out.println("7) MOSTRAR URNA");        
        System.out.println("----");            
            
        do {
            opcion = Entrada.leerOpcion(OPCIONES);    
            // System.out.println("La opción elegida por el usuario es "+opcion);            
            
            switch (opcion) {
                case '0': 
                    break;
                case '1': 
                    urna = new Urna(); 
                    System.out.println("Urna creada y guardada: "+urna); 
                    break;
                case '2': 
                    bola = leerBola();
                    System.out.println("Bola creada y guardada: "+bola); 
                    break;
                case '3':
                    urna.agregar(bola);
                    System.out.printf("La bola %s fue agregada a la urna %s\n", bola, urna);
                    break;
                case '4':
                case '5':
                case '6':                
                    System.out.println("Pendiente de implementar");                
                    break;
                case '7': 
                    if (urna==null)
                        System.out.println("No existe ninguna urna");
                    else
                        System.out.println(urna); 
                    break;                    
                default:
                    System.out.printf("Error: opción inesperada %c. Opciones posibles: %s\n", opcion, OPCIONES);                
                    System.exit(1);            
            }
        } while (opcion != '0');
    }
    
    private static Bola leerBola() {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        TipoColor tc = null;

        do {
            System.out.print("Introduzca el color de la bola a crear ("+COLORES+"):");       
            String color = sc.nextLine();

            switch (color) {
                case "AMARILLO":
                    tc = TipoColor.AMARILLO;
                    break;
                case "AZUL":
                    tc = TipoColor.AZUL;
                    break;                    
                case "BLANCO":
                    tc = TipoColor.BLANCO;
                    break;                    
                case "NEGRO":
                    tc = TipoColor.NEGRO;
                    break;                    
                case "ROJO":
                    tc = TipoColor.ROJO;
                    break;                    
                case "VERDE":
                    tc = TipoColor.VERDE;
                    break;                    
                default:
                    System.out.printf("Error: color incorrecto %s. Colores posibles: %s\n", color, COLORES);
                    break;
            }
        } while (tc==null);
        
        return new Bola(tc);
    }
    

}
