public class Persona {

    private String alias;       //Mayusculas, no null no vacio
    private String apellido;    //Mayusculas, no null no vacio
    private char sexo;          //Mayusculas, M o F
    private int anioNac;
    private String colorOjos;   //AZUL, GRIS, MARRON, NEGRO, VERDE.

    private Persona padre;      //padre.sexo = 'M'
    private Persona madre;      //madre.sexo = 'F'
    private Persona hijo1;      //hijo1 != hijo2
    private Persona hijo2;      //hijo2 != hijo1


    //Constructor

    public Persona(String alias, String apellido, char sexo, int anioNac, String colorOjos) {
        setAlias(alias);
        setApellido(apellido);
        setSexo(sexo);
        this.anioNac = anioNac;
        setColorOjos(colorOjos);
    }

    //Setters


    public void setAlias(String alias) {
        assert alias != null : "Error el alias no puede ser null.";
        assert !alias.isEmpty() : "Error el alias no puede estar vacio, debe tener al menos un caracter";

        this.alias = alias;
    }

    public void setApellido(String apellido) {
        assert apellido != null : "Error el apellido no puede ser null.";
        assert !apellido.isEmpty() : "Error el apellido no puede estar vacio, debe tener al menos un caracter";

        this.apellido = apellido;
    }


    private void setSexo(char sexo) {
        assert sexo == 'M' || sexo == 'F' : String.format("Error el sexo debe de ser 'M' o 'F', sexo introducido %c.\n", sexo);
        this.sexo = sexo;
    }

    private void setColorOjos(String colorOjos) {
        assert colorOjos.equals("AZUL") || colorOjos.equals("GRIS")
            || colorOjos.equals("MARRON") || colorOjos.equals("NEGRO")
            || colorOjos.equals("VERDE") : String.format("Error: el color de ojos solo puede ser (AZUL, MARRON, GRIS, NEGRO o VERDE, color introducido: %s", colorOjos);

        this.colorOjos = colorOjos;
    }

    public void setPadre(Persona padre) {
        assert padre.sexo == 'M' : String.format("Error: el padre tiene que tener genero 'M'. genero introducido %c", padre.sexo);
        assert padre != this : "Una persona no puede ser padre a si mismo.";

        this.padre = padre;
    }

    public void setMadre(Persona madre) {
        assert madre.sexo == 'F' : String.format("Error: la madre tiene que tener genero 'F'. genero introducido %c", madre.sexo);
        assert madre != this : "Una persona no puede ser madre de si misma.";

        this.madre = madre;
    }

    public void setHijo1(Persona hijo1) {
        assert hijo1 != this : "Una persona no puede tenerse a si mismo como hijo.";
        assert hijo1 != hijo2 : String.format("Error: esta persona ya es padre de %s."+ hijo1.alias);

        this.hijo1 = hijo1;
    }

    public void setHijo2(Persona hijo2) {
        assert hijo2 != this : "Una persona no puede tenerse a si mismo como hijo.";
        assert hijo2 != hijo1 : String.format("Error: esta persona ya es padre de %s.",hijo2.alias);

        this.hijo2 = hijo2;
    }

    //Getters

    public Persona getPadre() {
        return padre;
    }

    public String getAlias() {
        return alias;
    }

    public Persona getHijo1() {
        return hijo1;
    }

    //Otros metodos

    public void asignarPadre(Persona persona){
        assert (persona.hijo1 == null || persona.hijo2 == null) && this.padre ==null : "Error esta persona no puede tener mas hijos";
        setPadre(persona);
        asignarHijo(persona);
    }

    public void asignarHijo(Persona persona) {
        persona.setHijo1(this);
    }

    public boolean mayorQue(Persona p){
        return this.anioNac < p.anioNac;

    }

    @Override
    public String toString() {
        return "alias= " + alias + " , apellido= " + apellido + " , sexo= " + sexo + " , anioNac=" + anioNac + " , colorOjos= " + colorOjos +
                (padre == null ? ", padre= Null" : ", padre = " +padre.alias) +
                (madre == null ? ", madre= Null" : ", madre = " +madre.alias) +
                (hijo1 == null ? ", hijo1= Null" : ", hijo1 = " +hijo1.alias) +
                (hijo2 == null ? ", hijo2= Null" : ", hijo2 = " +hijo2.alias);
    }

}

