/*
 * PROMPT INICIAL:
 * Modificar la implementación de la cola enlazada para que sea genérica (Cola<T>).
 * El comportamiento FIFO se mantiene independientemente del tipo de dato porque la regla de negocio de una cola 
 * (el primero que entra es el primero que sale) depende exclusivamente del orden de actualización de los punteros 'head' y 'tail', 
 * aislando por completo la lógica de la estructura de la naturaleza de la información que guarda.
 * Probarla con nombres (String) y con una clase Cliente personalizada.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
class Cliente {
    String nombre;
    int id;
    Cliente(String n, int i) { nombre = n; id = i; }
    public String toString() { return nombre + " (" + id + ")"; }
}

public class Ejercicio4_ColaGenerica<T> {
    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> head, tail;

    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (head == null) { head = tail = nuevo; } 
        else { tail.siguiente = nuevo; tail = nuevo; }
    }

    public T desencolar() {
        if (head == null) return null;
        T dato = head.dato;
        head = head.siguiente;
        if (head == null) tail = null;
        return dato;
    }

    public static void main(String[] args) {
        Ejercicio4_ColaGenerica<String> colaNombres = new Ejercicio4_ColaGenerica<>();
        colaNombres.encolar("Ana");
        System.out.println("Atendido: " + colaNombres.desencolar());

        Ejercicio4_ColaGenerica<Cliente> colaClientes = new Ejercicio4_ColaGenerica<>();
        colaClientes.encolar(new Cliente("Juan", 101));
        System.out.println("Atendido: " + colaClientes.desencolar());
    }
}
