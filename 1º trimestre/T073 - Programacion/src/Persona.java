public class Persona {

    private Persona progenitor;      //0..*
    private Persona conyuge;         //0..1
    private Persona Amigo;           //0..*
    private String nombre;           //not null, no vacio

    public Persona(String nombre) {
       setNombre(nombre);
    }

    private void setNombre(String nombre) {
        assert !nombre.isEmpty() : "Error: el nombre no puede estar vacio.";
        assert nombre != null : "Error: el nombre no puede ser null.";
        this.nombre = nombre;
    }

    public void setConyuge(Persona conyuge) {
        assert this.conyuge == null : "Esta persona esta casada";
        this.conyuge = conyuge;
    }


}
