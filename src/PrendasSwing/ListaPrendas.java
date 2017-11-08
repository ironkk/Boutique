
package PrendasSwing;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author ironkk
 */
public class ListaPrendas {

    private ArrayList<Prenda> listaPrendas;

    public ListaPrendas() {
        listaPrendas = new ArrayList<>();
    }

    public ArrayList<Prenda> getLista() {
        return listaPrendas;
    }

    public void setLista(ArrayList<Prenda> lista) {
        this.listaPrendas = lista;
    }

    public boolean existe(Prenda p) {
        return listaPrendas.contains(p);
    }

    public void altaPrenda(Prenda p) {
        listaPrendas.add(p);
    }

    public void bajaPrenda(Prenda p) {
        listaPrendas.remove(p);
    }

    public ArrayList<String> colores() {
        ArrayList<String> col = new ArrayList<>();
        for (Prenda p : listaPrendas) {
            if (!col.contains(p.getColor())) {
                col.add(p.getColor());
            }
        }
        return col;
    }
       public ArrayList<String> tallas() {
        ArrayList<String> tal = new ArrayList<>();
        for (Prenda p : listaPrendas) {
            if (!tal.contains(p.getTalla())) {
                tal.add(p.getTalla());
            }
        }
        return tal;
    }

    public ListaPrendas prendasByColor(String color) {
        ListaPrendas prendasByCol = new ListaPrendas();
        for (Prenda p : listaPrendas) {
            if (color.equalsIgnoreCase(p.getColor())) {
                prendasByCol.altaPrenda(p);
            }
        }
        return prendasByCol;
    }

    public ListaPrendas prendasByTalla(String talla) {
        ListaPrendas prendasByTal = new ListaPrendas();
        for (Prenda p : listaPrendas) {
            if (talla.equalsIgnoreCase(p.getTalla())) {
                prendasByTal.altaPrenda(p);
            }
        }
        return prendasByTal;
    }
    public String calcularStock() {

        double valorTotal = 0;
        DecimalFormat dv = new DecimalFormat("##.##");
        for (Prenda p : listaPrendas) {
            double valorPrendas = p.getCoste() * p.getStock();
            valorTotal += valorPrendas;
        }
        return dv.format(valorTotal);
    }

    public int totalNPrendas() {
        int numeroprendas = 0;
        for (Prenda p : listaPrendas) {
            numeroprendas += +p.getStock();
        }
        return numeroprendas;
    }
}
