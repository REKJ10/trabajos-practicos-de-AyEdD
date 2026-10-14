/*
 * PROMPT INICIAL:
 * Implementar una Lista Doblemente Enlazada simple y genérica.
 * A diferencia de la lista simple, cada nodo aquí tiene tres referencias: el 'dato', un puntero 'siguiente', y un puntero 'anterior'. 
 * Se necesita 'anterior' para poder recorrer la lista eficientemente hacia atrás sin tener que volver al inicio.
 * Casos especiales al eliminar: 
 * 1. Eliminar el head (hay que actualizar el head y hacer que el nuevo head.anterior sea null).
 * 2. Eliminar el tail (actualizar tail y hacer nuevo tail.siguiente null).
 * 3. Eliminar en el medio (conectar el nodo.anterior con el nodo.siguiente, saltando el nodo a borrar en ambas direcciones).
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno, el manejo de punteros dobles es correcto.
 */
public class Ejercicio10_ListaDoble<T> {
    static class NodoDoble<T> {
        T dato;
        NodoDoble<T> anterior, siguiente;
        NodoDoble(T dato) { this.dato = dato; }
    }

    private NodoDoble<T> head, tail;

    public void insertarAlInicio(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (head == null) { head = tail = nuevo; } 
        else { nuevo.siguiente = head; head.anterior = nuevo; head = nuevo; }
    }

    public void insertarAlFinal(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (tail == null) { head = tail = nuevo; } 
        else { tail.siguiente = nuevo; nuevo.anterior = tail; tail = nuevo; }
    }

    public boolean eliminar(T dato) {
        NodoDoble<T> actual = head;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior != null) actual.anterior.siguiente = actual.siguiente;
                else head = actual.siguiente; // Era el head

                if (actual.siguiente != null) actual.siguiente.anterior = actual.anterior;
                else tail = actual.anterior; // Era el tail

                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirAdelante() {
        NodoDoble<T> actual = head;
        while (actual != null) { System.out.print(actual.dato + " <-> "); actual = actual.siguiente; }
        System.out.println("null");
    }

    public void imprimirAtras() {
        NodoDoble<T> actual = tail;
        while (actual != null) { System.out.print(actual.dato + " <-> "); actual = actual.anterior; }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Ejercicio10_ListaDoble<Integer> lista = new Ejercicio10_ListaDoble<>();
        lista.insertarAlFinal(10); lista.insertarAlFinal(20); lista.insertarAlInicio(5);
        lista.imprimirAdelante(); // 5 <-> 10 <-> 20
        lista.eliminar(10);
        lista.imprimirAtras();    // 20 <-> 5
    }
}
