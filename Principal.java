import javax.swing.*;
public class Principal {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();
        int aux=0;
        boolean vacio=l.vacio();
        do{
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar valor\n2.Tamaño de lista\n3.Es vacia\n"));
        switch (op) {
            case 1:
                int valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Valor a agregar:"));
                l.push(valor);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "contiene "+l.getTamaño()+"elementos.");
            break;

            case 3:
                if (vacio) {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                } else{
                    JOptionPane.showMessageDialog(null, "La lista no esta vacia");
                }
            break;

            default:
            }
             aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Quiere hacer otra operacion? 1=si/2=no"));
        } while(aux==1);
    }
}
