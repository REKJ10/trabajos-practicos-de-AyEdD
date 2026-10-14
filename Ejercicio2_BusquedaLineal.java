/*
 * PROMPT SIMULADO:
 * "Necesito hacer en Java un algoritmo de búsqueda lineal para encontrar un elemento en un vector desordenado. 
 * Esta estrategia es la adecuada porque, al no estar ordenado, no podemos asumir la posición del elemento y 
 * sí o sí tenemos que revisar uno por uno. Analizame el mejor caso, peor caso y caso promedio. Además, 
 * que el programa imprima cuántas posiciones se recorrieron hasta encontrarlo o hasta definir que no está."
 *
 * ANÁLISIS DE COMPLEJIDAD:
 * - Mejor caso: O(1) (el elemento está en la primera posición).
 * - Peor caso: O(n) (el elemento está en la última posición o no está en el vector).
 * - Caso promedio: O(n) (en promedio se recorre la mitad del vector, n/2, lo que equivale a O(n)).
 */

public class Ejercicio2_BusquedaLineal {
    public static void main(String[] args) {
        int[] vector = {14, 2, 8, 22, 5};
        int objetivo = 8;
        int posicionesRecorridas = 0;
        boolean encontrado = false;

        // Recorremos el vector elemento por elemento
        for (int i = 0; i < vector.length; i++) {
            posicionesRecorridas++; // Contamos la posición revisada
            if (vector[i] == objetivo) {
                System.out.println("Elemento " + objetivo + " encontrado en el índice " + i);
                encontrado = true;
                break; // Cortamos la búsqueda al encontrarlo
            }
        }

        if (!encontrado) {
            System.out.println("El elemento no existe en el vector.");
        }
        System.out.println("Posiciones recorridas: " + posicionesRecorridas);
    }
}
