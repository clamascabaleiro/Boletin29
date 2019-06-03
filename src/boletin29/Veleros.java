package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Veleros extends Barco {

    String matriVel;

    public Veleros(String matricula,float eslora, int mastilCv) {
        super(eslora, mastilCv);
        this.matriVel = matricula;
    }

    @Override
    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriVel
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}
