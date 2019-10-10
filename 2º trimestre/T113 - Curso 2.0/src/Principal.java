public class Principal {

    public static void main(String[] args) {

        String[] nombres = {"JUAN", "PEPE", "LUIS", "ANA", "MARIA"};
        Curso c1 = new Curso(nombres);
        System.out.println(c1.mostrarCurso());

        float[] mediaA = c1.mediaA();
        for (int i = 0; i < mediaA.length; i++) {
            System.out.println(mediaA[i]);
        }

        System.out.println("");

        float[] pesos = {0.3F,0.2F,0.5F};
        float[] mediaP = c1.mediaP(pesos);
        for (int i = 0; i < mediaP.length; i++) {
            System.out.println(mediaP[i]);
        }

        System.out.println("");
        String[] suspensos = c1.suspensos(2);
        Curso.mostrar(suspensos);

        System.out.println("");
        System.out.println("");

        int[][] notasDesiguales = c1.notasDesiguales();

        for (int i = 0; i < notasDesiguales.length; i++) {
            for (int j = 0; j < notasDesiguales[i].length; j++) {
                System.out.print(notasDesiguales[i][j]);
            }
            System.out.println("");
        }
    }

    /*
    ¿Tiene sentido usar luego ese array desigual?
    Depende de para que lo usemos lo podriamos usar para las medias aritmetica y podriamos quitarles algunas lineas de codigo al metodo.
    pero sin embargo si lo queremos usar para las medias ponderadas no nos serviria.

    ¿Se pierde información no recuperable?
    Realmente este array pierde informacion lo que pasa que lo que hemos hecho es creae un nuevo array a partir de otro por lo que la informacion podriamos recuperarla
    ya que esta almacenada en el array anterior.
     */

}
