/*
 * Prompt inicial utilizado:
 * A partir de una lista enlazada simple de enteros, necesito implementar un método boolean buscar(int dato).
 * El método debe recorrer la lista desde 'head' hasta encontrar el dato o llegar a null. 
 * Es importante destacar que, a diferencia de un arreglo, en una lista enlazada no se puede acceder 
 * directamente por índice porque los nodos están dispersos en la memoria; solo conocemos la ubicación 
 * del primero (head). Por esto, la búsqueda obliga a hacer un recorrido secuencial siguiendo los enlaces.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio2_BuscarElemento {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) head = nuevo;
        else {
            Nodo temp = head;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }

    // Método solicitado en el Ejercicio 2
    public boolean buscar(int dato) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == dato) {
                return true; // Encontrado
            }
            actual = actual.siguiente;
        }
        return false; // No encontrado
    }

    public static void main(String[] args) {
        Ejercicio2_BuscarElemento lista = new Ejercicio2_BuscarElemento();
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        System.out.println("¿Está el 20? " + lista.buscar(20));
        System.out.println("¿Está el 50? " + lista.buscar(50));
    }
}
