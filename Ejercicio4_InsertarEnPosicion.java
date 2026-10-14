/*
 * Prompt inicial utilizado:
 * Quiero implementar el método void insertarEnPosicion(int dato, int posicion) en mi lista enlazada.
 * Debe validar posiciones inválidas y contemplar inserción al inicio, medio y final.
 * El orden correcto al actualizar referencias en el medio es crítico: primero el nuevo nodo debe apuntar 
 * al nodo siguiente del actual (nuevo.setSiguiente(actual.getSiguiente())), y recién después el actual 
 * debe apuntar al nuevo nodo (actual.setSiguiente(nuevo)). Si lo hacemos al revés, sobrescribimos 
 * la referencia original del actual y perdemos el resto de la lista para siempre.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno. La explicación del puntero garantizó el orden correcto.
 */

public class Ejercicio4_InsertarEnPosicion {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;
    private int size = 0;

    public void imprimir() {
        Nodo actual = head;
        while (actual != null) { System.out.print(actual.dato + " -> "); actual = actual.siguiente; }
        System.out.println("null");
    }

    // Método solicitado en el Ejercicio 4
    public void insertarEnPosicion(int dato, int posicion) {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        
        Nodo nuevo = new Nodo(dato);
        
        if (posicion == 0) { // Al inicio
            nuevo.siguiente = head;
            head = nuevo;
        } else { // En el medio o al final
            Nodo actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            // Orden crucial de actualización
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
        size++;
    }

    public static void main(String[] args) {
        Ejercicio4_InsertarEnPosicion lista = new Ejercicio4_InsertarEnPosicion();
        lista.insertarEnPosicion(10, 0); // Inicio
        lista.insertarEnPosicion(30, 1); // Final
        lista.insertarEnPosicion(20, 1); // Medio
        lista.imprimir(); // Esperado: 10 -> 20 -> 30 -> null
    }
}
