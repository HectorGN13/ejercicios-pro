public class Tablero {
    private static final int MINFILA=1;
    private static final int MAXFILA=3;
    private static final int MINCOLUMNA=1;
    private static final int MAXCOLUMNA=3;

    private Casilla c11;    // NO NULO, NO MODIFICABLE
    private Casilla c12;    // NO NULO, NO MODIFICABLE
    private Casilla c13;    // NO NULO, NO MODIFICABLE
    private Casilla c21;    // NO NULO, NO MODIFICABLE
    private Casilla c22;    // NO NULO, NO MODIFICABLE
    private Casilla c23;    // NO NULO, NO MODIFICABLE
    private Casilla c31;    // NO NULO, NO MODIFICABLE
    private Casilla c32;    // NO NULO, NO MODIFICABLE
    private Casilla c33;    // NO NULO, NO MODIFICABLE

    public Tablero() {
        setC11(new Casilla());
        setC12(new Casilla());
        setC13(new Casilla());
        setC21(new Casilla());
        setC22(new Casilla());
        setC23(new Casilla());
        setC31(new Casilla());
        setC32(new Casilla());
        setC33(new Casilla());
    }

    //getters

    public static int getMINFILA() { return MINFILA; }

    public static int getMAXFILA() {
        return MAXFILA;
    }

    public static int getMINCOLUMNA() {
        return MINCOLUMNA;
    }

    public static int getMAXCOLUMNA() {
        return MAXCOLUMNA;
    }


    //setters

    private void setC11(Casilla c11) {
        assert c11 != null : "Error: la casilla (1,1) no puede ser nula";
        this.c11 = c11;
    }

    private void setC12(Casilla c12) {
        assert c12 != null : "Error: la casilla (1,2) no puede ser nula";
        this.c12 = c12;
    }

    private void setC13(Casilla c13) {
        assert c13 != null : "Error: la casilla (1,3) no puede ser nula";
        this.c13 = c13;
    }

    private void setC21(Casilla c21) {
        assert c21 != null : "Error: la casilla (2,1) no puede ser nula";
        this.c21 = c21;
    }

    private void setC22(Casilla c22) {
        assert c22 != null : "Error: la casilla (2,2) no puede ser nula";
        this.c22 = c22;
    }

    private void setC23(Casilla c23) {
        assert c23 != null : "Error: la casilla (2,3) no puede ser nula";
        this.c23 = c23;
    }

    private void setC31(Casilla c31) {
        assert c31 != null : "Error: la casilla (3,1) no puede ser nula";
        this.c31 = c31;
    }

    private void setC32(Casilla c32) {
        assert c32 != null : "Error: la casilla (3,2) no puede ser nula";
        this.c32 = c32;
    }

    private void setC33(Casilla c33) {
        assert c33 != null : "Error: la casilla (3,3) no puede ser nula";
        this.c33 = c33;
    }

    public void colocar(Ficha ficha, Coordenada c) {
        assert ficha != null : "Error: la ficha a colocar no puede ser nula";
        assert c != null : "Error: la coordenada no puede ser nula";
        assert esCoordenada(c) : String.format("Error: la coordenada %s no es válida", c);

        getCasilla(c).colocar(ficha);
    }


    private Casilla getCasilla(Coordenada c) {
        assert esCoordenada(c) : String.format("Error: la coordenada %s no es válida", c);
        assert c != null : "Error: la coordenada no puede ser nula";

        int fila=c.getFila();
        int columna=c.getColumna();
        Casilla casilla = null;
        switch (fila) {
            case 1:
                switch (columna) {
                    case 1:
                        casilla = c11;
                        break;
                    case 2:
                        casilla = c12;
                        break;
                    case 3:
                        casilla = c13;
                        break;
                    default:
                        assert false : String.format("Error: columna %d incorrecta", columna);
                }
                break;
            case 2:
                switch (columna) {
                    case 1:
                        casilla = c21;
                        break;
                    case 2:
                        casilla = c22;
                        break;
                    case 3:
                        casilla = c23;
                        break;
                    default:
                        assert false : String.format("Error: columna %d incorrecta", columna);
                }
                break;
            case 3:
                switch (columna) {
                    case 1:
                        casilla = c31;
                        break;
                    case 2:
                        casilla = c32;
                        break;
                    case 3:
                        casilla = c33;
                        break;
                    default:
                        assert false : String.format("Error: columna %d incorrecta", columna);
                }
                break;
            default:
                assert false : String.format("Error: fila %d incorrecta", fila);

        }
        return casilla;
    }

    public boolean estaVacia(Coordenada c) {
        return getCasilla(c).estaVacia();
    }

    public boolean esCoordenada(Coordenada c) {
        assert c != null : "Error: la coordenada c no puede ser nula";

        int fila=c.getFila();
        int columna=c.getColumna();

        return fila>=MINFILA && fila<=MAXFILA && columna>=MINCOLUMNA && columna<=MAXCOLUMNA;
    }

    public boolean esLinea(Coordenada c1, Coordenada c2, Coordenada c3){

        assert c1 != null : String.format("Error: la coordenada intorducida %s no puede ser null", c1);
        assert c2 != null : String.format("Error: la coordenada intorducida %s no puede ser null", c2);
        assert c3 != null : String.format("Error: la coordenada intorducida %s no puede ser null", c3);
        assert esCoordenada(c1) : String.format("Error: la coordenada intorducida %s debe de ser una coordenada valida", c1);
        assert esCoordenada(c2) : String.format("Error: la coordenada intorducida %s debe de ser una coordenada valida", c2);
        assert esCoordenada(c3) : String.format("Error: la coordenada intorducida %s debe de ser una coordenada valida", c3);
        assert estanEnFila(c1,c2,c3) || estanEnColumna(c1,c2,c3) || estanEnDiagonal(c1,c2,c3)
                : String.format("Error: las coordenadas %s %s %s no forman una fila, ni una columna ni una diagonal",
                c1, c2, c3);

        Casilla casilla1 = getCasilla(c1);
        Casilla casilla2 = getCasilla(c2);
        Casilla casilla3 = getCasilla(c3);

        Ficha f1 = casilla1.getFicha();
        Ficha f2 = casilla2.getFicha();
        Ficha f3 = casilla3.getFicha();

        return  !(casilla1.estaVacia() || casilla2.estaVacia() || casilla3.estaVacia())
                && f1.equals(f2) && f2.equals(f3);
    }

    private boolean estanEnFila(Coordenada c1, Coordenada c2, Coordenada c3){
        return c1.getFila() == c2.getFila() && c2.getFila() == c3.getFila();
    }

    private boolean estanEnColumna(Coordenada c1, Coordenada c2, Coordenada c3){
       return c1.getColumna() == c2.getColumna() && c2.getColumna() == c3.getColumna();
    }

   private boolean estanEnDiagonal(Coordenada c1, Coordenada c2, Coordenada c3){
       boolean diagonalPrincipal = c1.getFila()==c1.getColumna()
               && c2.getFila()==c2.getColumna()
               && c3.getFila()==c3.getColumna();
       boolean diagonalSecundaria  =   c1.getFila()+c1.getColumna()==filas()+1
               && c2.getFila()+c2.getColumna()==filas()+1
               && c3.getFila()+c3.getColumna()==filas()+1;
       return diagonalPrincipal || diagonalSecundaria;
   }

    public boolean estaCompleto(){
        int contador = 0;

        for (int i = getMINFILA(); i <= getMAXFILA() ; i++) {
            for (int j = getMINCOLUMNA(); j <= getMAXCOLUMNA() ; j++) {
                int fila = i;
                int columna = j;
                Coordenada coord = new Coordenada(fila,columna);
                if (!getCasilla(coord).estaVacia()){
                    contador++;
                }
            }
        }

        if (contador >= getMAXFILA() * getMAXCOLUMNA()){
            return true;
        } return false;
    }

    public int filas() {
        return (MAXFILA-MINFILA)+1;
    }

    public int columnas() {
        return (MAXCOLUMNA-MINCOLUMNA)+1;
    }

    @Override
    public String toString() {
        return String.format(   "%s%s%s\n%s%s%s\n%s%s%s\n",
                c11, c12, c13,
                c21, c22, c23,
                c31, c32, c33   );
    }
}