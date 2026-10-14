/*
 * PROMPT SIMULADO:
 * "Quiero la implementación del algoritmo Bubble Sort (ordenamiento burbuja) en Java. En los comentarios, 
 * explicame por qué este algoritmo solo sirve para fines didácticos o para vectores muy chicos. 
 * Además, el código tiene que ir contando e imprimir al final cuántas comparaciones y cuántos intercambios se hicieron en total."
 *
 * EXPLICACIÓN BUBBLE SORT:
 * Este algoritmo resulta adecuado únicamente para fines didácticos debido a su pésimo rendimiento 
 * en grandes conjuntos de datos. Su complejidad temporal es de O(n^2), lo que significa que a medida 
 * que crece el vector, el tiempo de ejecución crece exponencialmente.
 */

import java.util.Arrays;

public class Ejercicio10_BubbleSort {
    public static void main(String[] args) {
        int[] vector = {64, 34, 25, 12, 22, 11, 90};
        int comparaciones = 0;
        int intercambios = 0;

        System.out.println("Vector original: " + Arrays.toString(vector));

        int n = vector.length;
        // Bucle externo para las pasadas
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++; // Contamos la comparación
                if (vector[j] > vector[j + 1]) {
                    // Intercambiamos si están en el orden equivocado
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    intercambios++; // Contamos el intercambio
                }
            }
        }

        System.out.println("Vector ordenado: " + Arrays.toString(vector));
        System.out.println("Comparaciones realizadas: " + comparaciones);
        System.out.println("Intercambios realizados: " + intercambios);
    }
}
