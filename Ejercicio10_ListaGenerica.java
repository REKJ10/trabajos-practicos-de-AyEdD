/*
 * Prompt inicial utilizado:
 * Necesito tomar la implementación de mi lista enlazada simple y transformarla en una versión genérica: ListaEnlazada<T> y Nodo<T>.
 * Las partes que cambian son: el tipo del atributo 'dato' en el Nodo pasa de 'int' a 'T', y los métodos que reciben 
 * o devuelven el dato ahora usan 'T'. 
 * Las partes que se mantienen iguales son: toda la manipulación de enlaces ('siguiente', 'head') y los algoritmos 
 * de recorrido, inserción y eliminación. Esto es así porque la estructura subyacente de la lista (cómo se conectan los nodos) 
 * es completamente independiente del tipo de dato almacenado; a la lista no le importa si guarda enteros o Strings, 
 * solo le importa organizar las referencias en memoria.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio10_ListaGenerica<T> {
    
    // Nodo genérico
    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo<T> head;
    private int size;

    public Ejercicio10_ListaGenerica() {
        this.head = null;
        this.size = 0;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo<T> actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public void imprimir() {
        Nodo<T> actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Probando con Integers
        Ejercicio10_ListaGenerica<Integer> listaNumeros = new Ejercicio10_ListaGenerica<>();
        listaNumeros.insertarAlFinal(100);
        listaNumeros.insertarAlFinal(200);
        System.out.print("Lista Integer: "); listaNumeros.imprimir();

        // Probando con Strings
        Ejercicio10_ListaGenerica<String> listaStrings = new Ejercicio10_ListaGenerica<>();
        listaStrings.insertarAlFinal("Hola");
        listaStrings.insertarAlFinal("OpenCode");
        System.out.print("Lista String: "); listaStrings.imprimir();
    }
}
