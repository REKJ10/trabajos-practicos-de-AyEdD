/*
 * Prompt inicial utilizado:
 * Necesito implementar una lista enlazada simple de números enteros en Java desde cero, sin usar ArrayList ni LinkedList.
 * Razonamiento: Un nodo se representará con una clase interna que contenga un entero (dato) y una referencia 'siguiente' a otro nodo. 
 * El atributo 'head' (cabeza) será el punto de entrada a la lista; si es null, la lista está vacía. 
 * Además, usaré una variable 'size' que incrementaré en cada inserción para llevar la cuenta.
 * Necesito los métodos: insertarAlInicio, insertarAlFinal, imprimir, estaVacia y getSize.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno, el código base se generó perfectamente.
 */

public class Ejercicio1_CrearLista {
    static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo head;
    private int size;

    public Ejercicio1_CrearLista() {
        this.head = null;
        this.size = 0;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = head;
        head = nuevo;
        size++;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public void imprimir() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public boolean estaVacia() { return head == null; }
    public int getSize() { return size; }

    public static void main(String[] args) {
        Ejercicio1_CrearLista lista = new Ejercicio1_CrearLista();
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.imprimir();
        System.out.println("Tamaño: " + lista.getSize());
    }
}
