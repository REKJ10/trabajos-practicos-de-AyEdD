/*
 * Prompt inicial utilizado:
 * Necesito el método boolean eliminar(int dato) para eliminar la primera aparición de un valor en la lista.
 * Se deben contemplar todos los casos: lista vacía, eliminar el primero, el del medio, el último, y que el dato no exista.
 * En Java, no borramos la memoria manualmente (como un 'free' en C). Simplemente cambiamos los enlaces para que el nodo 
 * a eliminar quede inaccesible desde 'head'. Una vez que no hay referencias apuntando a él, el Garbage Collector de Java 
 * se encarga de liberar la memoria automáticamente.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio5_EliminarPorValor {
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
    public void imprimir() {
        Nodo temp = head; while(temp!=null) { System.out.print(temp.dato + "->"); temp=temp.siguiente;} System.out.println("null");
    }

    // Método solicitado en el Ejercicio 5
    public boolean eliminar(int dato) {
        if (head == null) return false; // Lista vacía

        // Si es el primer nodo
        if (head.dato == dato) {
            head = head.siguiente; // Queda inaccesible para el Garbage Collector
            return true;
        }

        // Buscar en el medio o final
        Nodo actual = head;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        // Si lo encontramos
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente; // Saltamos el nodo
            return true;
        }

        return false; // Dato no existe
    }

    public static void main(String[] args) {
        Ejercicio5_EliminarPorValor lista = new Ejercicio5_EliminarPorValor();
        lista.insertarAlFinal(10); lista.insertarAlFinal(20); lista.insertarAlFinal(30);
        lista.eliminar(20);
        lista.imprimir(); // Esperado: 10->30->null
    }
}
