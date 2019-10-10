import javax.swing.*;

public class Boton extends JButton {

    private boolean activado;

    public Boton() {
        super();
        activado = true;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
}
