/*
 * Prompt inicial utilizado:
 * Implementar el método void modificar(int posicion, int nuevoDato).
 * Debe validar la posición antes de recorrer. 
 * La diferencia clave aquí es que no vamos a tocar ni alterar los enlaces de la estructura de la lista 
 * (la referencia 'siguiente' queda intacta). Solo vamos a navegar hasta el nodo deseado y reemplazaremos 
 * únicamente el valor interno (el 'dato').
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */

public class Ejercicio7_ModificarElemento {
    static class Nodo { int dato; Nodo siguiente; Nodo(int d) { dato = d; } }
    private Nodo head;
    private int size = 0;

    public void insertarAlFinal(int dato) {
        Nodo n = new Nodo(dato);
        if (head == null) head = n;
        else { Nodo t = head; while (t.siguiente != null) t = t.siguiente; t.siguiente = n; }
        size++;
    }
    public void imprimir() { Nodo t = head; while(t!=null){ System.out.print(t.dato+"->"); t=t.siguiente; } System.out.println("null"); }

    // Método solicitado en el Ejercicio 7
    public void modificar(int posicion, int nuevoDato) {
        if (posicion < 0 || posicion >= size) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        
        Nodo actual = head;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        
        // Modificamos solo el dato, las referencias se mantienen
        actual.dato = nuevoDato;
    }

    public static void main(String[] args) {
        Ejercicio7_ModificarElemento lista = new Ejercicio7_ModificarElemento();
        lista.insertarAlFinal(100); lista.insertarAlFinal(200);
        lista.modificar(1, 999);
        lista.imprimir(); // Esperado: 100->999->null
    }
}
