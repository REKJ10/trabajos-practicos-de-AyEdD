/*
 * PROMPT INICIAL:
 * Necesito implementar una Cola de enteros utilizando una lista enlazada simple. 
 * Corresponde usar una cola para mantener el comportamiento FIFO (First In, First Out).
 * Internamente, la estructura necesita mantener dos referencias: 'head' (frente) y 'tail' (final).
 * El problema de usar solamente 'head' es que cada vez que quisiéramos encolar un elemento nuevo al final, 
 * tendríamos que recorrer toda la lista, lo que daría una complejidad O(n). Al mantener un puntero 'tail', 
 * podemos insertar al final en tiempo constante O(1).
 * Operaciones requeridas: encolar, desencolar, consultar frente, estaVacia, buscar, imprimir.
 * Casos especiales: desencolar cuando está vacía y asegurarse de que 'tail' apunte a null cuando la cola queda vacía tras un desencolado.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
public class Ejercicio2_ColaEnlazada {
    static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; }
    }

    private Nodo head; // Frente
    private Nodo tail; // Final

    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            head = tail = nuevo;
        } else {
            tail.siguiente = nuevo;
            tail = nuevo;
        }
    }

    public Integer desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return null;
        }
        int dato = head.dato;
        head = head.siguiente;
        if (head == null) {
            tail = null; // Caso especial: la cola quedó vacía
        }
        return dato;
    }

    public Integer consultarFrente() {
        return estaVacia() ? null : head.dato;
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
        System.out.print("Frente -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("Final");
    }

    public static void main(String[] args) {
        Ejercicio2_ColaEnlazada cola = new Ejercicio2_ColaEnlazada();
        cola.encolar(1); cola.encolar(2); cola.encolar(3);
        cola.imprimir();
        System.out.println("Desencolado: " + cola.desencolar());
        cola.imprimir();
    }
}
