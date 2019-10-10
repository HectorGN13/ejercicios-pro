public class Persona {

    private String alias;
    private Persona esAmigo1;
    private Persona esAmigo2;
    private Persona esAmigo3;
    private Persona esConyuge;
    private Persona esPadre1;
    private Persona esPadre2;


    public Persona(String alias) {
        setAlias(alias);
    }

    public void setAlias(String alias) {
        assert alias != null : "Error el alias no puede ser null";
        assert !alias.isEmpty() : "Error el alias no puede estar vacio";
        this.alias = alias;
    }

    public void setEsAmigo1(Persona esAmigo1) {
        assert esAmigo1 != this : "Error una persona no puede ser amiga de si misma";
        assert esAmigo1 != this.esAmigo2 && esAmigo1 != this.esAmigo3 : "Error ya es amigo de esa persona";
        this.esAmigo1 = esAmigo1;
    }

    public void setEsAmigo2(Persona esAmigo2) {
        assert esAmigo2 != this : "Error una persona no puede ser amiga de si misma";
        assert esAmigo2 != this.esAmigo1 && esAmigo2 != this.esAmigo3 : "Error ya es amigo de esa persona";
        this.esAmigo2 = esAmigo2;
    }

    public void setEsAmigo3(Persona esAmigo3) {
        assert esAmigo3 != this : "Error una persona no puede ser amiga de si misma";
        assert esAmigo3 != this.esAmigo2 && esAmigo3 != this.esAmigo1 : "Error ya es amigo de esa persona";
        this.esAmigo3 = esAmigo3;
    }

    public void setEsConyuge(Persona esConyuge) {
        assert esConyuge != this : "Error una persona no puede estar casada consigo misma";
        this.esConyuge = esConyuge;
    }

    public void setEsPadre1(Persona esPadre1) {
        assert esPadre1 != this : "Error: una persona no puede ser padre de si mismo";
        assert esPadre1 != this.esPadre2 : "Error. ya es padre de esa persona";
        this.esPadre1 = esPadre1;
    }

    public void setEsPadre2(Persona esPadre2) {
        assert esPadre1 != this : "Error: una persona no puede ser padre de si mismo";
        assert esPadre2 != this.esPadre1 : "Error: ya es padre de esa persona";
        this.esPadre2 = esPadre2;
    }
}
