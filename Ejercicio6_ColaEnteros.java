/*
 * PROMPT INICIAL:
 * Quiero implementar una clase ColaEnteros en Java usando un arreglo. 
 * Necesito usar dos índices: 'front' y 'rear'. 'front' apunta al primer elemento que ingresó (el que se va a atender) 
 * y 'rear' apunta a la posición del último elemento insertado. 
 * Al hacer enqueue, incremento 'rear'. Al hacer dequeue, incremento 'front'.
 * Ajustes al prompt: Ninguno, la lógica de los punteros quedó clara.
 */
public class Ejercicio6_ColaEnteros {
    private int[] arreglo;
    private int front, rear, size, capacidad;

    public Ejercicio6_ColaEnteros(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) return;
        arreglo[++rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int item = arreglo[front++];
        size--;
        return item;
    }

    public int front() { return isEmpty() ? -1 : arreglo[front]; }
    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return rear == capacidad - 1; }
    public int size() { return size; }

    public static void main(String[] args) {
        Ejercicio6_ColaEnteros cola = new Ejercicio6_ColaEnteros(5);
        cola.enqueue(10);
        cola.enqueue(20);
        System.out.println("Frente: " + cola.front());
        System.out.println("Atendido: " + cola.dequeue());
        System.out.println("Tamaño: " + cola.size());
    }
}
