import java.util.ArrayList;
import java.util.List;

public class SeisDos {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(sumarPares(numeros));

    }

    public static int sumarPares(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)      // unboxing
                sum += i;
        return sum;
    }
}
