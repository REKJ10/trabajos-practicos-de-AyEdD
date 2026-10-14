/*
 * PROMPT INICIAL:
 * Necesito implementar una Pila de enteros utilizando una lista enlazada simple. 
 * Corresponde usar una pila porque el problema requiere un comportamiento LIFO (Last In, First Out). 
 * Internamente, el atributo 'head' de la lista representará el 'tope' de la pila. 
 * Esto es clave para lograr una complejidad de O(1) en las operaciones principales: si insertamos (push) 
 * y eliminamos (pop) siempre al inicio (en el head), no necesitamos recorrer toda la lista, garantizando 
 * que la operación tome tiempo constante.
 * Operaciones requeridas: apilar, desapilar, consultar tope, estaVacia, buscar, imprimir.
 * Casos especiales a contemplar: intentar desapilar o consultar el tope cuando la pila está vacía.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
public class Ejercicio1_PilaEnlazada {
    static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo head;

    public Ejercicio1_PilaEnlazada() {
        this.head = null;
    }

    // O(1)
    public void apilar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    // O(1)
    public Integer desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return null;
        }
        int dato = head.dato;
        head = head.siguiente;
        return dato;
    }

    // O(1)
    public Integer consultarTope() {
        if (estaVacia()) return null;
        return head.dato;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public boolean buscar(int dato) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo actual = head;
        System.out.print("Tope -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Ejercicio1_PilaEnlazada pila = new Ejercicio1_PilaEnlazada();
        pila.apilar(10); pila.apilar(20); pila.apilar(30);
        pila.imprimir();
        System.out.println("Desapilado: " + pila.desapilar());
        System.out.println("Contiene 10? " + pila.buscar(10));
    }
}
