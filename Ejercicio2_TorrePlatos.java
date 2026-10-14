/*
 * PROMPT INICIAL:
 * Quiero simular una torre de platos en Java usando un arreglo. Cada plato es un String con su nombre. 
 * Este problema se resuelve con una pila (LIFO - Last In, First Out) y no con una cola, porque 
 * físicamente los platos se apilan uno sobre otro, y solo puedo retirar o ver el plato que está en la cima.
 * Ajustes al prompt: Ninguno.
 */
public class Ejercicio2_TorrePlatos {
    private String[] pila;
    private int top;

    public Ejercicio2_TorrePlatos(int capacidad) {
        pila = new String[capacidad];
        top = -1;
    }

    public void agregarPlato(String plato) {
        if (top == pila.length - 1) return;
        pila[++top] = plato;
        System.out.println("Plato agregado: " + plato);
    }

    public void retirarPlato() {
        if (top == -1) return;
        System.out.println("Plato retirado: " + pila[top--]);
    }

    public void platoArriba() {
        if (top == -1) System.out.println("No hay platos");
        else System.out.println("Plato arriba: " + pila[top]);
    }

    public static void main(String[] args) {
        Ejercicio2_TorrePlatos torre = new Ejercicio2_TorrePlatos(5);
        torre.agregarPlato("Plato Hondo");
        torre.agregarPlato("Plato Playo");
        torre.platoArriba();
        torre.retirarPlato();
        torre.platoArriba();
    }
}
