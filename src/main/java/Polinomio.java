public interface Polinomio {

    int getGrado();
    nodo getTerminoMayor();
    void cargarTermino(int valor, int termino);
    void modificarTermino(int valor, int termino);
    int obtenerValor(int termino);

    void eliminarTermino(int termino);

    boolean existeTermino(int termino);

    Polinomio sumar(Polinomio p1);

    Polinomio multiplicar(Polinomio p1);

    void mostrarContenido();

}

