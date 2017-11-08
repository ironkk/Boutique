
package PrendasSwing;

/**
 *
 * @author ironkk
 */
public class BSwing {
    
    public static ListaPrendas misPrendas;
    public static ListaPrendas misPrendas2;
    public static void main(String[] args) {

        if (misPrendas == null) {
            misPrendas = new ListaPrendas();
            misPrendas2 = new ListaPrendas();
        }
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
    
}
