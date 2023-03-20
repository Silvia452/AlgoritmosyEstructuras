public class nodoImplement implements nodo {
    private datoPolinomio dato;
    private nodo siguiente;

    public nodoImplement(datoPolinomio dato) {
        this.dato = dato;
    }

    public datoPolinomio getDato() {
        return dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }


}
