import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Casa> casas = new ArrayList<Casa>();
        for (int i = 1; i <= 5; i++) {
            casas.add(new Casa(rnd.nextInt(100), "Casa"+i));
        }

        //Casas sin ordenar
        System.out.println("Casas sin ordenar \n");
        for (int i = 0; i < casas.size(); i++) {
            System.out.println(casas.get(i).toString());
        }
        System.out.println("");
        //Casas ordenadas
        casas.sort(Casa::compareTo);
        System.out.println("Casas Ordenadas \n");
        for (int i = 0; i < casas.size(); i++) {
            System.out.println(casas.get(i).toString());
        }
        System.out.println("");



        Rueda rueda1 = new Rueda(10, 20);
        Rueda rueda2 = new Rueda(10, 20);
        Rueda rueda3 = new Rueda(10, 20);
        Rueda rueda4 = new Rueda(10, 20);

        Coche c1 = new Coche(rueda1, rueda2, rueda3, rueda4);
        System.out.println(c1.toString());

        try {
            Coche c2 = (Coche) c1.clone();
            System.out.println(c2.toString());
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }




    }
}