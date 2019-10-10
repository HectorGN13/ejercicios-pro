 import java.util.Random;

    public class Curso {

        private static final int MAXESTUDIANTES = 5;
        private static final int MAXASIGNATURAS = 3;
        // Array de estudiantes
        private int[][] notas;
        private Estudiante[] estudiantes;

        public Curso(String[] estudiantes) {
            this.estudiantes = new Estudiante[estudiantes.length];
            for (int i = 0; i < estudiantes.length; i++) {
                this.estudiantes[i] = new Estudiante(estudiantes[i]);
            }
            inicializarEstudiantes(estudiantes, 3);
            inicializarNotas();
        }


        private void inicializarEstudiantes(String[] estudiantes, int asignaturas){
            assert estudiantes.length <= MAXESTUDIANTES && estudiantes.length >= 1 : String.format("Error: la longuitud del array de nombres debe ser mayor a 1 y menor de %d", MAXESTUDIANTES);
            assert asignaturas <= MAXASIGNATURAS && asignaturas >= 1 : String.format("Error: las asignatiras deben estar comprendidas entre 1 y %d", MAXASIGNATURAS);
            notas = new int[estudiantes.length][asignaturas];
        }

        private void inicializarNotas(){
            Random rnd = new Random();
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    notas[i][j] = rnd.nextInt(11)-1;
                }
            }
        }

        public String mostrarCurso(){
            String datos = "Asignatura";
            for (int i = 0; i < notas[0].length; i++) {
                datos += ("["+i+"]");
            }
            datos += "\n";
            for (int i = 0; i < notas.length; i++) {
                datos += estudiantes[i].getNombre() + "      ";
                for (int j = 0; j < notas[i].length; j++) {
                    datos += notas[i][j]+ "  ";
                }
                datos += "\n";
            }
            return datos;
        }


        public float[] mediaA(){
            float[] medias = new float[estudiantes.length];
            float media = 0F;
            int contador = 0;
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length ; j++) {
                    if (notas[i][j] == -1){
                        media += 0;
                        contador++;
                    } else
                    media += notas[i][j];
                }
                medias[i] = media / (notas[i].length-contador);
                media = 0F;
                contador = 0;
            }
            return medias;
        }

        public float[] mediaP(float[] pesos){
            float suma = 0.0F;
            for (int i = 0; i < pesos.length; i++) {
                suma += pesos[i];
            }
            assert suma == 1.0F : "Error la suma de los pesos tiene que dar como resultado 1";
            assert pesos.length == notas[0].length : "Error la longuitud del array pesos tiene que ser igual a las asignaturas que tiene los alumnos";
            float[] medias = new float[estudiantes.length];
            float media = 0F;
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length ; j++) {
                    media += notas[i][j] * pesos[j];
                }
                medias[i] = media;
                media = 0F;
            }
            return medias;

        }

        private int inicializarSuspensos(int numeroSuspensos){
            int contadorSuspensos = 0;
            int contadorAlumnos = 0;
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    if (notas[i][j] < 5){
                        contadorSuspensos++;
                    }
                }
                if (contadorSuspensos >= numeroSuspensos){
                    contadorAlumnos++;
                }
                contadorSuspensos = 0;
            }
            return contadorAlumnos;
        }

        public String[] suspensos(int numeroSuspensos){
            int tamanioArray = inicializarSuspensos(numeroSuspensos);
            String[] resultado = new String[tamanioArray];
            int banderita = 0;
            int contadorSuspensos = 0;
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    if (notas[i][j] < 5){
                        contadorSuspensos++;
                    }
                }
                if (contadorSuspensos >= numeroSuspensos){
                    resultado[banderita] = estudiantes[i].getNombre();
                    banderita++;
                }
                contadorSuspensos = 0;
            }
            return resultado;
        }

        public static void mostrar(String[] suspensos){
            assert suspensos != null : "Error el array introducido por parametro no puede ser null";
            System.out.print(suspensos[0]);
            for (int i = 1; i < suspensos.length; i++) {
                System.out.printf("," + suspensos[i]);
            }
        }

        public int[][] notasDesiguales(){
            int[][] resultado = new int[notas.length][];
            int contador = 0;
            int posicion = 0;
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    if (notas[i][j] != -1){
                        contador++;
                    }
                }
                resultado[i] = new int[contador];
                contador = 0;
            }
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    if (notas[i][j] != -1){
                        resultado[i][posicion] = notas[i][j];
                        posicion++;
                    }
                }
                posicion = 0;
            }
            return resultado;
        }

    }
