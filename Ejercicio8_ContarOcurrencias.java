/*
 * Prompt inicial utilizado:
 * Necesito implementar el método int contarOcurrencias(int dato) que cuente cuántas veces aparece un valor.
 * El método debe recorrer absolutamente toda la lista desde head hasta null llevando un contador. 
 * No podemos usar un 'break' o un 'return' al encontrar la primera coincidencia porque, al ser una lista 
 * desordenada, el mismo valor puede estar repetido más adelante en los siguientes nodos.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio8_ContarOcurrencias {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;

    public void insertarAlFinal(int dato) {
        Nodo n = new Nodo(dato);
        if (head == null) head = n;
        else { Nodo t = head; while (t.siguiente != null) t = t.siguiente; t.siguiente = n; }
    }

    // Método solicitado en el Ejercicio 8
    public int contarOcurrencias(int dato) {
        int contador = 0;
        Nodo actual = head;
        
        while (actual != null) {
            if (actual.dato == dato) {
                contador++;
            }
            actual = actual.siguiente; // Seguimos buscando sin cortar
        }
        return contador;
    }

    public static void main(String[] args) {
        Ejercicio8_ContarOcurrencias lista = new Ejercicio8_ContarOcurrencias();
        lista.insertarAlFinal(10); lista.insertarAlFinal(20); lista.insertarAlFinal(10);
        lista.insertarAlFinal(30); lista.insertarAlFinal(10);
        System.out.println("Ocurrencias del 10: " + lista.contarOcurrencias(10)); // Esperado: 3
    }
}
