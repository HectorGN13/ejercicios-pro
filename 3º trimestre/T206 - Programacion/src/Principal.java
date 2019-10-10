import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {


    public static void main(String[] args) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        propiedades.add(new Propiedad("user.country", "Configuracion regional"));
        propiedades.add(new Propiedad("java.runtime.version", "Version de la JRE"));
        propiedades.add(new Propiedad("java.vm.version", "Version de la JRE"));
        propiedades.add(new Propiedad("java.vm.version",
                "Versión de la especificación de la máquina virtual Java"));
        propiedades.add(new Propiedad("java.vm.specification.vendor",
                "Proveedor de la especificación de la máquina virtual Java"));
        propiedades.add(new Propiedad("os.version", "Version del sistema operativo"));
        propiedades.add(new Propiedad("user.home", "Ruta donde se encuentra el jdk"));
        propiedades.add(new Propiedad("java.vm.specification.version",
                "Versión de la especificación de la máquina virtual Java"));
        propiedades.add((new Propiedad("java.home","Directorio de la instalación")));
        propiedades.add((new Propiedad("user.language","Idioma del usuario")));
        propiedades.add((new Propiedad("file.encoding","Codificacion de caracteres")));
        propiedades.add((new Propiedad("os.name","Nombre del sistema operativo")));
        propiedades.add((new Propiedad("java.vendor",
                "Proveedor de entornos e tiempos de ejecucion java")));
        propiedades.add((new Propiedad("file.separator",
                "Carácter que separa los componentes de una ruta de archivo.")));
        propiedades.add((new Propiedad("user.dir", "Directorio de trabajo del usuario")));
        propiedades.add((new Propiedad("java.library.path",
                "Lista de rutas para buscar al cargar bibliotecas")));
        propiedades.add((new Propiedad("line.separator",
                "separador de linea")));

        Collections.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });

        try (FileWriter fic = new FileWriter("src/prop.txt")) {
            for (Propiedad p: propiedades) {
                fic.write(p.getNombre()+": "+p.getValor()+" --> "+p.getDescripcion()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

