/*
 * PROMPT INICIAL:
 * Necesito crear una clase Pila<T> genérica en Java basada en arreglos. 
 * El uso de genéricos (Generics) resuelve el problema de la duplicación de código, ya que 
 * a diferencia de una pila hecha solo con 'int', una pila genérica permite crear instancias 
 * que almacenen cualquier tipo de objeto (Integer, String, etc.) sin tener que reescribir la clase.
 * Ajustes al prompt: Se agregó un supresor de advertencias porque Java no permite instanciar arreglos genéricos directamente.
 */
public class Ejercicio5_PilaGenerica<T> {
    private T[] arreglo;
    private int top;

    @SuppressWarnings("unchecked")
    public Ejercicio5_PilaGenerica(int capacidad) {
        arreglo = (T[]) new Object[capacidad];
        top = -1;
    }

    public void push(T elemento) {
        if (top < arreglo.length - 1) arreglo[++top] = elemento;
    }

    public T pop() {
        if (top >= 0) return arreglo[top--];
        return null;
    }

    public static void main(String[] args) {
        Ejercicio5_PilaGenerica<String> pilaStrings = new Ejercicio5_PilaGenerica<>(5);
        pilaStrings.push("Hola");
        pilaStrings.push("Mundo");
        System.out.println("Pop String: " + pilaStrings.pop());

        Ejercicio5_PilaGenerica<Integer> pilaInts = new Ejercicio5_PilaGenerica<>(5);
        pilaInts.push(100);
        System.out.println("Pop Integer: " + pilaInts.pop());
    }
}
