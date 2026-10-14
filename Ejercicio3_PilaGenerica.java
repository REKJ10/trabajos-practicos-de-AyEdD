/*
 * PROMPT INICIAL:
 * Modificar la implementación de la pila enlazada para que sea genérica (Pila<T>).
 * Usar genéricos en Java permite crear una clase parametrizada que proporciona seguridad de tipos en tiempo de compilación. 
 * Esto significa que la misma estructura puede almacenar Integer, String o cualquier objeto propio sin duplicar código.
 * La lógica de la pila (LIFO, head como tope) no depende del tipo de dato almacenado porque la estructura solo se encarga 
 * de manipular las referencias en memoria (punteros 'siguiente') y no le importa el contenido del 'dato'.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
public class Ejercicio3_PilaGenerica<T> {
    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> head;

    public void apilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public T desapilar() {
        if (estaVacia()) return null;
        T dato = head.dato;
        head = head.siguiente;
        return dato;
    }

    public T consultarTope() {
        return estaVacia() ? null : head.dato;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public static void main(String[] args) {
        Ejercicio3_PilaGenerica<Integer> pilaInts = new Ejercicio3_PilaGenerica<>();
        pilaInts.apilar(100);
        System.out.println("Tope Integer: " + pilaInts.consultarTope());

        Ejercicio3_PilaGenerica<String> pilaStrings = new Ejercicio3_PilaGenerica<>();
        pilaStrings.apilar("Hola");
        System.out.println("Tope String: " + pilaStrings.consultarTope());
    }
}
