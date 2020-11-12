public class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo(){
        this.valor=0;
        this.siguiente=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int _valor) {
        this.valor=_valor;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo _siguiente) {
        this.siguiente=_siguiente;
    }
}
