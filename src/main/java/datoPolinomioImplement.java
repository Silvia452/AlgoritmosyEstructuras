public class datoPolinomioImplement implements nodo {
    private int valor;
    private int termino;

    public datoPolinomioImplement(int valor, int termino) {
        this.valor = valor;
        this.termino = termino;
        this.setSiguiente(null);
    }

    @Override
    public datoPolinomio getDato() {
        return null;
    }

    @Override
    public nodo getSiguiente() {
        return null;
    }

    @Override
    public void setSiguiente(nodo siguiente) {

    }
}

