/**
 * @file Lista.java
 */
public class Lista{

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
        n. setValor(valor);

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


    
}