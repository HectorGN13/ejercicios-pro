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
    }
}
