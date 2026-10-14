/*
 * Prompt inicial utilizado:
 * Quiero implementar el método void invertir() para una lista enlazada simple.
 * Para invertir los enlaces in-place sin perder nodos, necesito tres referencias auxiliares: 
 * 'anterior' (inicialmente null), 'actual' (inicia en head) y 'siguiente'. 
 * El orden es fundamental: dentro del ciclo, PRIMERO guardo 'siguiente = actual.siguiente' (para no perder el resto de la lista), 
 * SEGUNDO invierto el enlace 'actual.siguiente = anterior', TERCERO avanzo 'anterior = actual', 
 * y CUARTO avanzo 'actual = siguiente'. Al final, 'head' pasa a ser 'anterior'.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno, el manejo de punteros se generó de manera correcta.
 */

public class Ejercicio9_InvertirLista {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;

    public void insertarAlFinal(int dato) {
        Nodo n = new Nodo(dato);
        if (head == null) head = n;
        else { Nodo t = head; while (t.siguiente != null) t = t.siguiente; t.siguiente = n; }
    }
    public void imprimir() { Nodo t = head; while(t!=null){ System.out.print(t.dato+"->"); t=t.siguiente; } System.out.println("null"); }

    // Método solicitado en el Ejercicio 9
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = head;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente; // Guarda el resto
            actual.siguiente = anterior;  // Invierte el enlace
            anterior = actual;            // Avanza 'anterior'
            actual = siguiente;           // Avanza 'actual'
        }
        head = anterior; // Nuevo inicio de la lista
    }

    public static void main(String[] args) {
        Ejercicio9_InvertirLista lista = new Ejercicio9_InvertirLista();
        lista.insertarAlFinal(10); lista.insertarAlFinal(20); 
        lista.insertarAlFinal(30); lista.insertarAlFinal(40);
        System.out.print("Original: "); lista.imprimir();
        lista.invertir();
        System.out.print("Invertida: "); lista.imprimir();
    }
}
