public class Main {

    public static void main(String[] args) {
        PolinomioImplement polinomio = new PolinomioImplement();
        polinomio.cargarTermino(3, 4);
        polinomio.cargarTermino(-2, 3);
        polinomio.cargarTermino(5, 1);
        polinomio.cargarTermino(1, 0);
        polinomio.mostrarContenido();

        polinomio.modificarTermino(-1, 3);
        polinomio.eliminarTermino(1);
        polinomio.mostrarContenido();

        PolinomioImplement otroPolinomio = new PolinomioImplement();
        otroPolinomio.cargarTermino(2, 3);
        otroPolinomio.cargarTermino(-1, 1);
        otroPolinomio.cargarTermino(3, 0);
        otroPolinomio.mostrarContenido();

        Polinomio resultado = polinomio.sumar(otroPolinomio);
        resultado.mostrarContenido();

        resultado = polinomio.multiplicar(otroPolinomio);
        resultado.mostrarContenido();



    }
}
