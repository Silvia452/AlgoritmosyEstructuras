public class datoPolinomioImplement implements datoPolinomio, nodo {
    private int valor;
    private int termino;

    public datoPolinomioImplement(int valor, int termino) {
        this.valor = valor;
        this.termino = termino;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
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

