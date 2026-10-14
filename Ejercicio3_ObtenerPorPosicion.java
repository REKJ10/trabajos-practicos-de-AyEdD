/*
 * Prompt inicial utilizado:
 * Necesito implementar el método int obtener(int posicion) para una lista enlazada.
 * Debe validar si la posición es < 0 o >= size. 
 * Aunque pidamos el elemento en una "posición", la lista enlazada no tiene acceso directo como un arreglo. 
 * Esto significa que obligatoriamente debemos recorrer la lista nodo por nodo, llevando un contador, 
 * hasta llegar a la posición deseada.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Se agregó lanzar una excepción si la posición es inválida para manejar el error correctamente.
 */

public class Ejercicio3_ObtenerPorPosicion {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;
    private int size = 0;

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) head = nuevo;
        else {
            Nodo temp = head;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
        size++;
    }

    // Método solicitado en el Ejercicio 3
    public int obtener(int posicion) {
        if (posicion < 0 || posicion >= size) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        Nodo actual = head;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public static void main(String[] args) {
        Ejercicio3_ObtenerPorPosicion lista = new Ejercicio3_ObtenerPorPosicion();
        lista.insertarAlFinal(100);
        lista.insertarAlFinal(200);
        lista.insertarAlFinal(300);
        System.out.println("Elemento en pos 1: " + lista.obtener(1));
    }
}
