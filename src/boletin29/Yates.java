package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Yates extends Barco {

    String matriYates;

    public Yates(String matriYates, float eslora, int camarotes, int cv) {
        super(eslora, camarotes, cv);
        this.matriYates = matriYates;
    }

    @Override
    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriYates
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}

