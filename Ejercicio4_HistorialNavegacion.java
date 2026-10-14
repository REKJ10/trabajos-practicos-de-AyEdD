/*
 * PROMPT INICIAL:
 * Quiero implementar un historial de navegación web usando un arreglo a modo de pila. 
 * El historial funciona bajo el principio LIFO (Last In, First Out) porque al presionar el botón "Atrás" 
 * en un navegador, siempre volvemos a la última página que visitamos, y luego a la penúltima, etc.
 * Ajustes al prompt: Ninguno.
 */
public class Ejercicio4_HistorialNavegacion {
    private String[] historial;
    private int top;

    public Ejercicio4_HistorialNavegacion(int capacidad) {
        historial = new String[capacidad];
        top = -1;
    }

    public void visitarPagina(String url) {
        if (top < historial.length - 1) {
            historial[++top] = url;
            System.out.println("Visitando: " + url);
        }
    }

    public void irAtras() {
        if (top > 0) {
            System.out.println("Saliendo de: " + historial[top--]);
            System.out.println("Volviendo a: " + historial[top]);
        } else {
            System.out.println("No hay más páginas en el historial.");
        }
    }

    public static void main(String[] args) {
        Ejercicio4_HistorialNavegacion nav = new Ejercicio4_HistorialNavegacion(10);
        nav.visitarPagina("google.com");
        nav.visitarPagina("youtube.com");
        nav.visitarPagina("github.com");
        nav.irAtras();
        nav.irAtras();
    }
}
