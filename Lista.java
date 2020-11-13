import javax.swing.JOptionPane;

/**
 * @file Lista.java
 * @author Elias Salazar Reyes
 * @version 0.0.1
 * @brief listas basicas
 */
public class Lista{
 /**
  * 
  */
    private int tamaño;
    private Nodo inicio;

    public Lista(){
        this.tamaño=0;
        this.inicio=null;
    }

    public boolean vacio() {
        return inicio==null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void push(int valor) {
        Nodo n = new Nodo();
        n.setValor(valor);

        if (vacio()) {
            inicio=n;
        } else{
            Nodo aux=inicio;
           while (aux.getSiguiente() != null) {
            aux=aux.getSiguiente();
            }
            aux.setSiguiente(n); 
        }
      tamaño++;  
    }

    public void listar(){
        if (!vacio()) {
            Nodo aux = inicio;
            int i=1;
            String aux2 = " ";
            while (aux !=null) {
                aux2 +="pos:"+i+"["+aux.getValor()+"]\n";
                aux=aux.getSiguiente();
                i++;
                }
                JOptionPane.showMessageDialog(null, aux2);
            } else{
            JOptionPane.showMessageDialog(null, "null");
        }

    }

    public void agregarInicio(int valor){
        Nodo n = new Nodo();
        n.setValor(valor);
        if (vacio()) {
            inicio=n;
        }else{
            n.setSiguiente(inicio);
            inicio=n;
        }
        tamaño++;
    }

    public boolean buscar(int numero) {
        Nodo aux = inicio;
        
        boolean encontrado=false;
        while (aux !=null && encontrado != true) {
            if(numero==aux.getValor()){
                encontrado=true;
            } else{
                aux=aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public void modificar(int numero,int valor) {
        if (buscar(numero)) {
            Nodo aux=inicio;
            while (aux.getValor() != numero){
                aux=aux.getSiguiente();
            }
            aux.setValor(valor);
        }
    }

    public void eliminar(int pos) {
        pos-=1;
        if (pos >=0 && pos <=tamaño) {
            if (pos==0) {
                inicio=inicio.getSiguiente();
            } else{
                Nodo aux=inicio;
                for (int i=0; i<pos-1;i++){
                    aux=aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        } else{
            JOptionPane.showMessageDialog(null,"La lsita no contiene ese dato");
        }
    }
}