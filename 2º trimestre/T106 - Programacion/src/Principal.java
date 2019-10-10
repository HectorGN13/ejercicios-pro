public class Principal {


    public static void main(String[] args) {
        Coche[] coches = {new Coche("audi"), new Coche("Mercedes"), new Coche("BMW")};
        Matricula[] matriculas = {new Matricula(1,2,3,4,"aaa"),
                                  new Matricula(4,3,2,1,"bbb"),
                                  new Matricula(1,2,3,1, "aaa")};



        for (Coche x:  matricular(coches,matriculas)) {
            System.out.println(x);
        }


    }


    public static Coche[] matricular(Matricula[] matriculas){
        assert matriculas.length == coches.length : "Error: ambos arrays deben tener la misma longitud";
        assert matriculas != null : "Error: asegura que las matriculas no sean null";

        for (Matricula x:matriculas) {
            assert x != null : "Error: no puede existir ningun valor null dentro del array de matriculas";
        }

        for (int i = 0; i < matriculas.length; i++) {
            for (int j = i+1; j < matriculas.length ; j++) {
                assert !matriculas[i].equals(matriculas[j]) : "Error: las matriculas no pueden coincidir";
            }
        }

        for (int i = 0; i < matriculas.length; i++) {
            coches[i].setMatricula(matriculas[i]);
        }
        return coches;
    }

}
