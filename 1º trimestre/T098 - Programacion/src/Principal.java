public class Principal {
    public static void main(String[] args) {

        Persona p1 = new Persona("JUAN");
        Persona p2 = new Persona("LUIS");
        Persona p3 = new Persona("PEPE");

        p1.setEsAmigo1(p2);
        //p1.setEsAmigo1(p1);
        //p1.setEsAmigo2(p2);
        p1.setEsAmigo3(p3);

    }
}
