

package boletin29;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin29 {

 
    public static void main(String[] args) {
        Barco barco1 = new Veleros("AGSAGAS54",20.44f,3);
        Barco barco2 = new Barco_Motor("KGLAGS5",5.62f,220);
        Barco barco3 = new Yates("GIDSAS42",30.45f,7,5955);
        barco1.lista.add(barco1);
        barco2.lista.add(barco2);
        barco3.lista.add(barco3);
        
        barco1.factura(0,5);
        barco2.factura(0,5);
        barco3.factura(0,5);

    }

}
