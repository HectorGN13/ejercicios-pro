public class Account {
    private int id;
    private String nombre;
    private String apellido;
    private double sueldo;


    public Account(int id, String nombre, String apellido, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }
}
