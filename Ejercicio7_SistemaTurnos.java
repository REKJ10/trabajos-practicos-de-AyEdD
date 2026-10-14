/*
 * PROMPT INICIAL:
 * Quiero implementar un sistema de turnos para una oficina usando un arreglo como cola. 
 * Este problema utiliza el principio FIFO (First In, First Out) y no LIFO, porque 
 * es un sistema justo: la primera persona que llega a la oficina es la primera que debe ser atendida. 
 * Si usara LIFO, el último en llegar pasaría primero, lo cual es incorrecto para turnos.
 * Ajustes al prompt: Ninguno.
 */
public class Ejercicio7_SistemaTurnos {
    private String[] fila;
    private int front, rear, size;

    public Ejercicio7_SistemaTurnos(int capacidad) {
        fila = new String[capacidad];
        front = 0; rear = -1; size = 0;
    }

    public void agregarPersona(String nombre) {
        if (size == fila.length) return;
        fila[++rear] = nombre;
        size++;
        System.out.println(nombre + " sacó turno.");
    }

    public void atenderSiguiente() {
        if (size == 0) return;
        System.out.println("Atendiendo a: " + fila[front++]);
        size--;
    }

    public void consultarPrimero() {
        if (size > 0) System.out.println("El próximo es: " + fila[front]);
    }

    public static void main(String[] args) {
        Ejercicio7_SistemaTurnos sistema = new Ejercicio7_SistemaTurnos(10);
        sistema.agregarPersona("Ana");
        sistema.agregarPersona("Juan");
        sistema.consultarPrimero();
        sistema.atenderSiguiente();
        sistema.consultarPrimero();
    }
}
