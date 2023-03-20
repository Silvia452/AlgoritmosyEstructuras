public class Main {

    public static void main(String[] args) {
        PolinomioImplement miPolinomio = new PolinomioImplement();
        // Agregar términos al polinomio
        miPolinomio.cargarTermino(3, 2);
        miPolinomio.cargarTermino(-2, 1);
        miPolinomio.cargarTermino(5, 0);
        // Mostrar contenido del polinomio en la consola
        miPolinomio.mostrarContenido();

        

    }
}
