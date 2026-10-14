/*
 * PROMPT INICIAL:
 * Necesito implementar una cola circular en Java usando arreglos para solucionar el desperdicio de memoria. 
 * Para esto, usaré el operador módulo '%'. Cuando 'rear' o 'front' lleguen al final del arreglo, 
 * en lugar de detenerse, la operación (rear + 1) % tamaño hará que vuelvan a la posición 0, reutilizando espacios. 
 * Para detectar si está llena, verificaré si el tamaño actual (llevando un contador 'size') es igual a la capacidad.
 * Ajustes al prompt: Ninguno, el uso del operador módulo resolvió el wrap-around perfectamente.
 */
public class Ejercicio10_ColaCircular {
    private int[] arreglo;
    private int front, rear, size, capacidad;

    public Ejercicio10_ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int valor) {
        if (size == capacidad) {
            System.out.println("Cola llena");
            return;
        }
        rear = (rear + 1) % capacidad;
        arreglo[rear] = valor;
        size++;
        System.out.println("Encolado: " + valor + " en índice " + rear);
    }

    public void dequeue() {
        if (size == 0) return;
        System.out.println("Desencolado: " + arreglo[front] + " desde índice " + front);
        front = (front + 1) % capacidad;
        size--;
    }

    public static void main(String[] args) {
        Ejercicio10_ColaCircular circular = new Ejercicio10_ColaCircular(3);
        circular.enqueue(1);
        circular.enqueue(2);
        circular.enqueue(3);
        circular.dequeue();
        circular.enqueue(4); // Acá envuelve y guarda en el índice 0
    }
}
