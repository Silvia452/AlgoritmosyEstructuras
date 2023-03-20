public class PolinomioImplement implements Polinomio{
    private int grado;
    private nodo terminoMayor;


    @Override
    public int getGrado() {
        return grado;
    }

    @Override
    public nodo getTerminoMayor() {
        return terminoMayor;
    }

    @Override
    public void cargarTermino(int valor, int termino) {
        if (valor != 0) {
            nodo nuevoNodo = new datoPolinomioImplement(valor, termino);
            if (nuevoNodo == null || nuevoNodo.getDato() == null) {
                return;
            }
            if (terminoMayor == null) {
                terminoMayor = nuevoNodo;
            } else {
                nodo actual = terminoMayor;
                nodo anterior = null;
                while (actual != null && actual.getDato() != null && actual.getDato().getTermino() > termino) {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
                if (actual != null && actual.getDato() != null && actual.getDato().getTermino() == termino) {
                    actual.getDato().setValor(valor);
                } else {
                    nuevoNodo.setSiguiente(actual);
                    if (anterior == null) {
                        terminoMayor = nuevoNodo;
                    } else {
                        anterior.setSiguiente(nuevoNodo);
                    }
                }
            }
            if (termino > grado) {
                grado = termino;
            }
        }
    }

    @Override
    public void modificarTermino(int valor, int termino) {
        nodo actual = terminoMayor;
        while (actual != null && actual.getDato().getTermino() > termino) {
            actual = actual.getSiguiente();
        }
        if (actual != null && actual.getDato().getTermino() == termino) {
            actual.getDato().setValor(valor);
        }
    }

    @Override
    public int obtenerValor(int termino) {
        nodo actual = terminoMayor;
        while (actual != null && actual.getDato().getTermino() > termino) {
            actual = actual.getSiguiente();
        }
        if (actual != null && actual.getDato().getTermino() == termino) {
            return actual.getDato().getValor();
        } else {
            return 0;
        }
    }

    @Override
    public void eliminarTermino(int termino) {
        nodo actual = terminoMayor;
        nodo anterior = null;
        while (actual != null && actual.getDato().getTermino() > termino) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null && actual.getDato().getTermino() == termino) {
            if (anterior == null) {
                terminoMayor = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
        }
    }

    @Override
    public boolean existeTermino(int termino) {
        nodo actual = terminoMayor;
        while (actual != null && actual.getDato().getTermino() > termino) {
            actual = actual.getSiguiente();
        }
        if (actual != null && actual.getDato().getTermino() == termino) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Polinomio sumar(Polinomio p1) {
        PolinomioImplement p = (PolinomioImplement) p1;
        PolinomioImplement resultado = new PolinomioImplement() {};
        nodo actual = terminoMayor;
        while (actual != null) {
            resultado.cargarTermino(actual.getDato().getValor(), actual.getDato().getTermino());
            actual = actual.getSiguiente();
        }
        actual = p.terminoMayor;
        while (actual != null) {
            resultado.cargarTermino(actual.getDato().getValor(), actual.getDato().getTermino());
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    @Override
    public Polinomio multiplicar(Polinomio p1) {
        PolinomioImplement p = (PolinomioImplement) p1;
        PolinomioImplement resultado = new PolinomioImplement() {};
        nodo actual = terminoMayor;
        while (actual != null) {
            nodo actual2 = p.terminoMayor;
            while (actual2 != null) {
                resultado.cargarTermino(actual.getDato().getValor() * actual2.getDato().getValor(), actual.getDato().getTermino() + actual2.getDato().getTermino());
                actual2 = actual2.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    @Override
    public void mostrarContenido() {
        nodo actual = terminoMayor;
        while (actual != null) {
            System.out.println("Valor: " + actual.getDato().getValor() + " - Termino: " + actual.getDato().getTermino());
            actual = actual.getSiguiente();
        }
    }


}
