/*
 * PROMPT INICIAL:
 * Necesito implementar una clase PilaEnteros en Java utilizando un arreglo de tamaño fijo. 
 * Para controlar los elementos, usaré un índice 'top' inicializado en -1, lo que indica que la pila está vacía. 
 * Al hacer 'push', incremento 'top' y guardo el valor; si top == tamaño - 1, la pila está llena (isFull). 
 * Al hacer 'pop', devuelvo el valor en 'top' y lo decremento; si top == -1, está vacía (isEmpty). 
 * El método 'peek' solo devuelve el valor en 'top' sin modificar el índice.
 * Ajustes al prompt: Ninguno, la explicación de los índices fue suficiente.
 */
public class Ejercicio1_PilaEnteros {
    private int[] arreglo;
    private int top;
    private int capacidad;

    public Ejercicio1_PilaEnteros(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.top = -1;
    }

    public void push(int elemento) {
        if (isFull()) {
            System.out.println("Error: Pila llena");
            return;
        }
        arreglo[++top] = elemento;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Error: Pila vacía");
            return -1;
        }
        return arreglo[top--];
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arreglo[top];
    }

    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == capacidad - 1; }
    public int size() { return top + 1; }

    public static void main(String[] args) {
        Ejercicio1_PilaEnteros pila = new Ejercicio1_PilaEnteros(3);
        pila.push(10);
        pila.push(20);
        System.out.println("Tope: " + pila.peek());
        System.out.println("Sacando: " + pila.pop());
        System.out.println("Tamaño actual: " + pila.size());
    }
}
