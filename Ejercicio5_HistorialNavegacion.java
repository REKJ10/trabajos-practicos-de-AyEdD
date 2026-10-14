/*
 * PROMPT INICIAL:
 * Implementar un sistema de historial de navegación usando una Pila enlazada genérica de Strings.
 * Una pila representa correctamente el comportamiento de "volver atrás" porque funciona con LIFO. 
 * A medida que navegamos, apilamos la página actual. Al presionar "atrás", desapilamos la página más reciente (tope de la pila) 
 * y revelamos la página inmediatamente anterior que estaba debajo.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Se reutilizó la clase Ejercicio3_PilaGenerica en la lógica para evitar código duplicado.
 */
public class Ejercicio5_HistorialNavegacion {
    private Ejercicio3_PilaGenerica<String> historial;

    public Ejercicio5_HistorialNavegacion() {
        historial = new Ejercicio3_PilaGenerica<>();
    }

    public void visitarPagina(String url) {
        historial.apilar(url);
        System.out.println("Visitando: " + url);
    }

    public void volverAtras() {
        String eliminada = historial.desapilar();
        if (eliminada != null) {
            String actual = historial.consultarTope();
            System.out.println("Volviendo atrás... Página actual: " + (actual != null ? actual : "Inicio vacío"));
        } else {
            System.out.println("No hay historial para volver atrás.");
        }
    }

    public void paginaActual() {
        System.out.println("Página actual: " + historial.consultarTope());
    }

    public static void main(String[] args) {
        Ejercicio5_HistorialNavegacion nav = new Ejercicio5_HistorialNavegacion();
        nav.visitarPagina("google.com");
        nav.visitarPagina("github.com");
        nav.paginaActual();
        nav.volverAtras();
    }
}
