/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que busque un número dentro de un arreglo, sin usar ciclos.
 * Este problema puede resolverse recursivamente pasando el arreglo y un índice inicial como parámetros.
 * El caso base ocurre de dos formas: cuando el índice llega al final del arreglo (devuelve false) o cuando el elemento en el índice actual coincide con el buscado (devuelve true).
 * El caso recursivo es buscar(arreglo, valor, indice + 1), porque avanzamos de posición en el arreglo sin usar ni for ni while.
 * La función debe devolver un booleano indicando el resultado.
 * Quiero que el código tenga comentarios y se pruebe con:
 * - caso 1: {1, 2, 3}, buscar 2, índice 0
 * - caso 2: {1, 2, 3}, buscar 5, índice 0
 */

public class Ejercicio10_BuscarArreglo {
    public static boolean buscar(int[] arr, int valor, int indice) {
        // Caso base 1: llegamos al final del arreglo y no lo encontramos
        if (indice == arr.length) {
            return false;
        }
        // Caso base 2: encontramos el valor
        if (arr[indice] == valor) {
            return true;
        }
        // Caso recursivo: avanzamos al siguiente índice
        // Pila para buscar 3 en {1,2,3}: buscar idx 0 -> buscar idx 1 -> buscar idx 2 -> retorna true.
        return buscar(arr, valor, indice + 1);
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3};
        System.out.println("Caso 1 (buscar 2): " + buscar(arreglo, 2, 0)); // Esperado: true
        System.out.println("Caso 2 (buscar 5): " + buscar(arreglo, 5, 0)); // Esperado: false
    }
}
