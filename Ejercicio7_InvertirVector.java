/*
 * PROMPT SIMULADO:
 * "Necesito dos versiones en Java para invertir un vector. Una versión tiene que usar un vector auxiliar nuevo, 
 * y la otra versión tiene que hacerlo invirtiendo el mismo vector sin usar memoria adicional significativa. 
 * Incluí una comparación entre las dos explicando ventajas, desventajas y la complejidad temporal y espacial."
 *
 * COMPARACIÓN:
 * 1. Con Vector Auxiliar:
 *    - Ventajas: No modifica el vector original.
 *    - Desventajas: Ocupa el doble de memoria.
 *    - Temporal: O(n) | Espacial: O(n)
 * 2. In-Place (Mismo Vector):
 *    - Ventajas: Ahorra memoria, más eficiente en espacio.
 *    - Desventajas: Destruye (modifica) el orden del vector original.
 *    - Temporal: O(n) | Espacial: O(1)
 */

import java.util.Arrays;

public class Ejercicio7_InvertirVector {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(vector));

        // VERSIÓN 1: Vector Auxiliar
        int[] auxiliar = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            auxiliar[i] = vector[vector.length - 1 - i];
        }
        System.out.println("Versión Auxiliar: " + Arrays.toString(auxiliar));

        // VERSIÓN 2: In-Place
        int[] vectorInPlace = {1, 2, 3, 4, 5}; // Clonamos para el ejemplo
        int inicio = 0;
        int fin = vectorInPlace.length - 1;
        while (inicio < fin) {
            int temp = vectorInPlace[inicio];
            vectorInPlace[inicio] = vectorInPlace[fin];
            vectorInPlace[fin] = temp;
            inicio++;
            fin--;
        }
        System.out.println("Versión In-Place: " + Arrays.toString(vectorInPlace));
    }
}
