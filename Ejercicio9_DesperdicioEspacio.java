/*
 * PROMPT INICIAL:
 * Quiero demostrar el problema de desperdicio de espacio en una cola simple (lineal) hecha con arreglos en Java. 
 * El código debe realizar varias operaciones enqueue y dequeue, e imprimir el estado interno del arreglo para 
 * evidenciar explícitamente cómo van quedando espacios vacíos (y marcados como nulos o inutilizables) al inicio 
 * del arreglo a medida que avanza el puntero 'front', los cuales no pueden ser reutilizados aunque haya lugar.
 * Ajustes al prompt: Se agregó un método para imprimir el arreglo crudo y mostrar las celdas vacías.
 */
import java.util.Arrays;

public class Ejercicio9_DesperdicioEspacio {
    private String[] arreglo;
    private int front, rear;

    public Ejercicio9_DesperdicioEspacio(int cap) {
        arreglo = new String[cap];
        front = 0; rear = -1;
    }

    public void enqueue(String s) {
        if (rear == arreglo.length - 1) {
            System.out.println("No se puede encolar " + s + ", el puntero rear llegó al final!");
            return;
        }
        arreglo[++rear] = s;
    }

    public void dequeue() {
        if (front > rear) return;
        System.out.println("Atendido: " + arreglo[front]);
        arreglo[front++] = null; // Borramos para ver el hueco
    }

    public void mostrarArreglo() {
        System.out.println("Memoria interna: " + Arrays.toString(arreglo));
    }

    public static void main(String[] args) {
        Ejercicio9_DesperdicioEspacio cola = new Ejercicio9_DesperdicioEspacio(3);
        cola.enqueue("A"); cola.enqueue("B"); cola.enqueue("C");
        cola.mostrarArreglo();
        cola.dequeue(); cola.dequeue();
        cola.mostrarArreglo();
        cola.enqueue("D"); // Falla porque rear ya está en el límite, aunque haya 2 espacios libres.
    }
}
