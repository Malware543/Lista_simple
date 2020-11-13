import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();
        int aux=0;
        do{
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar valor\n2.Tamaño de lista\n3. Comprobar si esta vacia"+
        "\n4.Listar\n5.Agregar al inicio\n"+
        "6.Buscar\n7.Modificar\n8.Eliminar\n9.Salir"));
        switch (op) {
            case 1:
                int valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Valor a agregar:"));
                l.push(valor);
                aux=1;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "contiene "+l.getTamaño()+" elementos.");
                aux=1;
            break;

            case 3:
                if (l.vacio()) {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                } else{
                    JOptionPane.showMessageDialog(null, "La lista no esta vacia");
                }
                aux=1;
            break;
            case 4:
                l.listar();
                aux=1;
            break;
            case 5:
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor a agregar al inicio"));
                l.agregarInicio(numero);
                aux=1;
            break;
            case 6:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor a buscar"));
                if (l.buscar(numero)==true) {
                    JOptionPane.showMessageDialog(null,"El numero se encuentra en la lista");
                } else{
                    JOptionPane.showMessageDialog(null,"El numero no se encuentra en la lista");
                }
                aux=1;
            break;
            case 7:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor a modificar"));
                valor =Integer.parseInt(JOptionPane.showInputDialog(null,"Nuevo valor"));
                l.modificar(numero, valor); 
                aux=1;   
            break;
            case 8:
                int pos=Integer.parseInt(JOptionPane.showInputDialog(null,"Posicion a eliminar"));
                l.eliminar(pos);
                aux=1;
            break;
            case 9:
            aux=0;
            break;
            default:
                JOptionPane.showMessageDialog(null,"opcion no validad");
            }
        } while(aux==1);
    }
}
