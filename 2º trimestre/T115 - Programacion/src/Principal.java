public class Principal {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona(175);
        Persona p3 = new Persona(175);
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona(175);


        Persona[] arrayPersona = new Persona[6];

        arrayPersona[0] = p6;
        arrayPersona[1] = p4;
        arrayPersona[2] = p2;
        arrayPersona[3] = p5;
        arrayPersona[4] = p3;
        arrayPersona[5] = p1;


        for (int i = 0; i < arrayPersona.length ; i++) {
            System.out.println(arrayPersona[i]);
        }

        ordenar(arrayPersona);
        System.out.println("");

        for (int i = 0; i < arrayPersona.length ; i++) {
            System.out.println(arrayPersona[i]);
        }
    }

    public static void ordenar(Persona[] arrayPersonas){
        Persona aux;
        for(int i=1;i < arrayPersonas.length;i++){
            for (int j=0 ; j < arrayPersonas.length- 1; j++){
                if (arrayPersonas[j].compareTo(arrayPersonas[j+1]) < 0){
                    aux = arrayPersonas[j];
                    arrayPersonas[j] = arrayPersonas[j+1];
                    arrayPersonas[j+1] = aux;
                }
            }
        }
    }

}
