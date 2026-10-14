/*
 * Prompt inicial utilizado:
 * Quiero implementar void eliminarEnPosicion(int posicion).
 * Primero se debe validar que la posición sea correcta (>=0 y < size).
 * Para eliminar un nodo que no sea el primero, debo ubicar el nodo ANTERIOR al que quiero borrar. 
 * Para esto, recorro hasta (posicion - 1). Una vez ahí, hago que el puntero 'siguiente' del nodo 
 * anterior apunte directamente al nodo 'siguiente' del que voy a eliminar (saltándolo). 
 * No olvidar restar 1 al atributo size.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio6_EliminarPorPosicion {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;
    private int size = 0;

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) head = nuevo;
        else { Nodo temp = head; while (temp.siguiente != null) temp = temp.siguiente; temp.siguiente = nuevo; }
        size++;
    }
    public void imprimir() { Nodo t = head; while(t!=null){ System.out.print(t.dato+"->"); t=t.siguiente; } System.out.println("null"); }

    // Método solicitado en el Ejercicio 6
    public void eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= size) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }

        if (posicion == 0) {
            head = head.siguiente;
        } else {
            Nodo anterior = head;
            // Buscar el nodo anterior al que queremos eliminar
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.siguiente;
            }
            // Saltamos el nodo eliminado
            anterior.siguiente = anterior.siguiente.siguiente;
        }
        size--;
    }

    public static void main(String[] args) {
        Ejercicio6_EliminarPorPosicion lista = new Ejercicio6_EliminarPorPosicion();
        lista.insertarAlFinal(1); lista.insertarAlFinal(2); lista.insertarAlFinal(3);
        lista.eliminarEnPosicion(1); // Borra el 2
        lista.imprimir(); // Esperado: 1->3->null
    }
}
