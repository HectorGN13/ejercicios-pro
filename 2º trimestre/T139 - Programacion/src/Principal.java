import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Principal {

    public static void main(String[] args) {

        //EJERCICIO 1
        int one = 1;
        String color = "red";
        Formatter f = new Formatter();
        System.out.println(f.format("One=%d, colour=%s%n", one, color));
        System.out.println(String.format("One=%d, Color=%s%n", one, color));


        //EJERCICIO 2
        String[] lefts = {"cat", "dog", "bird", "elephant"};
        String[] rights = {"orange", "black", "blue", "grey"};

        // Loop over both arrays and display paired strings.
        for (int i = 0; i < lefts.length; i++) {
            String left = lefts[i];
            String right = rights[i];

            // Add padding to the right.
            // ... Add padding to the left.
            String value = String.format("%1$-10s %2$10s", left, right);
            System.out.println(value);
        }
            //EJERCICIO 3
            String formatS = "%-10s%-10s%-10s%-10s%-10s\n";
            String.format(formatS, "Degrees", "Radians", "Sine", "Cosine", "Tangent");

            // Display values for 30 degrees
            int degrees = 30;
            double radians = Math.toRadians(degrees);
            System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians,
                    Math.sin(radians), Math.cos(radians), Math.tan(radians));

            // Display values for 60 degrees
            degrees = 60;
            radians = Math.toRadians(degrees);
            System.out.println(String.format(formatS, degrees, radians,
                    Math.sin(radians), Math.cos(radians), Math.tan(radians)));

    }
}
