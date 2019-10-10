import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {


        List<Character> caracteres =  List.of('A', 'B', 'a', 'c', 'Ñ', 'O', 'Z', 'z');

        Character[] arrayOrdenadoSinCollator = (Character[]) caracteres.toArray(new Character[0]);
        List<Character> ordenacionCollator = new ArrayList<Character>(caracteres);


        Collator collator = Collator.getInstance(new Locale("es"));
        collator.setStrength(Collator.PRIMARY);

        Arrays.sort(arrayOrdenadoSinCollator);
        //ordenacionCollator.sort(collator);

        for (char x:arrayOrdenadoSinCollator) {
            System.out.print(x);
        }


    }
}
