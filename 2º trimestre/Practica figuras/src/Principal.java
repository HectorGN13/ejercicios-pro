import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Punto centro1 = new Punto(10,20);
        Punto centro2 = new Punto(20,10);

        Figura f1 = new Cuadrado(TipoColor.ROJO, 2);
        f1.setCentro(centro1);
        Figura f2 = new Rectangulo(TipoColor.AMARILLO, 4,4);
        f2.setCentro(centro1);
        Figura f3 = new Circulo(TipoColor.AZUL, 5);
        f3.setCentro(centro1);
        Figura f4 = new Cuadrado(TipoColor.ROJO, 2);
        f4.setCentro(centro1);
        Figura f5 = new Triangulo(TipoColor.VERDE, 7,4);
        f5.setCentro(centro1);
        Figura f6 = new Cuadrado(TipoColor.AZUL, 3);
        f6.setCentro(centro1);
        Figura f7 = new Circulo(TipoColor.AMARILLO, 8);
        f7.setCentro(centro1);
        Figura f8 = new Triangulo(TipoColor.ROJO, 10,15);
        f8.setCentro(centro2);

        Figura[] arrayFiguras = {f1, f2, f3, f4, f5, f6, f7};

        ArrayList<Figura> figuras = new ArrayList<>(Arrays.asList(arrayFiguras));

        System.out.println(figuras);
        System.out.println(estaLaFigura(f4,figuras));
        System.out.println(estaLaFigura(f8,figuras));
    }

    public static boolean estaLaFigura(Figura elemento, List<Figura> lista){
        boolean correcto = false;
        for (Figura x: lista) {
            if (x.equals(elemento)){
                correcto = true;
                break;
            }
        }
        return correcto;
    }


}
