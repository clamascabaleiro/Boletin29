package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Barco_Motor extends Barco {

    String matriDepor;

    public Barco_Motor(String matriDepor, float eslora, int mastilCv) {
        super(eslora, mastilCv);
        this.matriDepor = matriDepor;
    }

    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriDepor
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}
