import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class Principal {
    public static void main(String[] args) {
        List cadenas = List.of("Cataluña", "Pais Vasco", "Andalucia", "andalucia", "Ándalucia");

        String[] arrayOrdenadoSinCollator = (String[]) cadenas.toArray(new String[5]);
        List ordenacionCollator = new ArrayList(cadenas);

        Collator collator = Collator.getInstance(new Locale("es"));
        collator.setStrength(Collator.PRIMARY);


        Arrays.sort(arrayOrdenadoSinCollator);
        ordenacionCollator.sort(collator);


        System.out.printf("Ordenación sin clase Collator:             %s%n", Arrays.asList(arrayOrdenadoSinCollator));
        System.out.printf("Ordenación con clase Collator:             %s%n", ordenacionCollator );

    }
}
