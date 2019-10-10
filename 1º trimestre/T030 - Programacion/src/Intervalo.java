public class Intervalo {


    private int inicio;
    private int fin;

    public Intervalo(int inicio, int fin) {
        setInicio(inicio);
        setFin(fin);
    }

    private void setInicio(int inicio) {
        //assert inicio<=fin : "Error: inicio no puede ser mayor que fin";
        this.inicio = inicio;
    }

    private void setFin(int fin) {
        assert fin>=inicio : "Error: fin no puedes ser menor que inicio";
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public boolean pertenenciaCerrado(int elemento) {
        boolean respuesta = false;
        for (int i = getInicio(); i < getFin(); i++) {
            respuesta = (i == elemento);
        }
        return respuesta;
    }

    public boolean pertenenciaAbierto(int elemento) {
        boolean respuesta = false;
        for (int i = getInicio()+1; i < getFin()-1; i++) {
            respuesta = (i == elemento);
        }
        return respuesta;
    }

    public boolean pertenenciaAbiertoInicio(int elemento) {
        boolean respuesta = false;
        for (int i = getInicio()+1; i < getFin(); i++) {
            respuesta = (i == elemento);
        }
        return respuesta;
    }

    public boolean pertenenciaAbiertoFinal(int elemento) {
        boolean respuesta = false;
        for (int i = getInicio(); i < getFin()-1; i++) {
            respuesta = (i == elemento);
        }
        return respuesta;
    }

    public boolean solapamiento(Intervalo intervalo){
        boolean respuesta = false;
            if (intervalo.getInicio() <= getFin() && intervalo.getFin() >= getFin()){
                respuesta = true;
            } else if (intervalo.getInicio() <= getInicio() && intervalo.getFin() <= getInicio()){
                respuesta = true;
            } else if (intervalo.getInicio() <= getInicio() && intervalo.getFin() >= getFin()){
                respuesta = true;
            } else if (intervalo.getInicio() >= getInicio() && intervalo.getFin() <= getFin()){
                respuesta = true;
            }
        return respuesta;
    }

    public boolean inclusion(Intervalo intervalo){
        return intervalo.getInicio() <= getFin() && intervalo.getFin() <= getFin();
    }

    @Override
    public String toString() {
        return "Intervalo{" +
                "inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }
}
