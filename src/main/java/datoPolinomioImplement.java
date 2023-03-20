public class datoPolinomioImplement implements datoPolinomio {
    private int valor;
    private int termino;

    public datoPolinomioImplement(int valor, int termino) {
        this.valor = valor;
        this.termino = termino;
    }

    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public int getTermino() {
        return termino;
    }

    @Override
    public int setValor(int valor) {
        this.valor = valor;
        return valor;
    }
}

