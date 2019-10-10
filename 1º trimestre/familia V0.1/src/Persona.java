public class Persona {

    private String alias;       // no null, no vacio
    private char sexo;          // 'V' y 'M'
    private Persona padre;
    private Persona madre;
    private Persona conyuge;


    public Persona(String alias, char sexo) {
        this.alias = alias;
        this.sexo = sexo;
    }


    //Setters

    private void setAlias(String alias) {
        assert !alias.isEmpty() : "Error: el alias no puede estar vacio.";
        assert alias != null : "Error: el alias no puede ser null.";
        this.alias = alias;
    }

    private void setSexo(char sexo) {
        assert sexo == 'V' || sexo == 'M' : String.format("Error el sexo solo puede ser 'M' o 'V'. sexo = %c", sexo );
        this.sexo = sexo;
    }

    public void setPadre(Persona padre) {
        assert padre.getSexo() == 'V' : String.format("Error: el padre no puede tener un sexo diferente al sexo 'V', sexo padre = %c", padre.getSexo());
        this.padre = padre;
    }

    public void setMadre(Persona madre) {
        assert madre.getSexo() == 'M' : String.format("Error: la madre no puede tener un sexo diferente al sexo 'M', sexo madre = %c", madre.getSexo());
        this.madre = madre;
    }

    public void setConyuge(Persona conyuge) {
        if (this.getSexo() == 'V'){
            assert conyuge.getSexo() == 'M' : "Error: los conyuges deben tener sexo distinto (VIVIMOS EN UNA SOCIEDAD RETROGRADA)";
        } else {
            assert conyuge.getSexo() == 'V' : "Error: los conyuges deben tener sexo distinto (VIVIMOS EN UNA SOCIEDAD RETROGRADA)";
        }
        this.conyuge = conyuge;
    }

    //Getters

    public String getAlias() {
        return alias;
    }

    public char getSexo() {
        return sexo;
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public Persona getConyuge() {
        return conyuge;
    }

    //Otros metodos

    public void casar(Persona p1){
        if (this.estaCasada() == false && p1.estaCasada() == false){
        setConyuge(p1);
        casar2(p1);
        }
    }
    private void casar2(Persona p2){
        p2.setConyuge(this);
    }

    public boolean estaCasada(){
        if (getConyuge() == null){
            return false;
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        return "Persona{" +
                "alias='" + alias + '\'' +
                ", sexo=" + sexo +
                ", padre=" + padre +
                ", madre=" + madre +
                ", conyuge=" + (getConyuge() == null ? "Null"
                : getConyuge().getAlias()) +
                '}';
    }
}
