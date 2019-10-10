public class Estudiante {

    String nombre;
    float mediaAritmetica;
    float mediaPonderada;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }


    public void setMediaAritmetica(float mediaAritmetica) {
        this.mediaAritmetica = mediaAritmetica;
    }

    public void setMediaPonderada(float mediaPonderada) {
        this.mediaPonderada = mediaPonderada;
    }

    public String getNombre() {
        return nombre;
    }

    public float getMediaAritmetica() {
        return mediaAritmetica;
    }

    public float getMediaPonderada() {
        return mediaPonderada;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", mediaAritmetica=" + mediaAritmetica +
                '}';
    }
}

