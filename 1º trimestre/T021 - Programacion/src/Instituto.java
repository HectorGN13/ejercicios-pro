public class Instituto {

    public Instituto() {
    }

    public void crearAlumnos(int numero){
        Alumno[] alumnos;
        alumnos = new Alumno[numero];
        for (int i = 1; i <= 5; i++) {
            alumnos[i] = new Alumno(String.valueOf(numero));
        }
    }
}
