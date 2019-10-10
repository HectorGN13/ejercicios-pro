/*Ejercicio 1*/

public class Casa implements Comparable<Casa>{
    private String nombre;
    private int superficie;

    public Casa(int superficie, String nombre) {
        this.superficie = superficie;
        this.nombre= nombre;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Casa o) {
        return superficie - o.superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "nombre='" + nombre + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}