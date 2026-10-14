/*
 * PROMPT SIMULADO:
 * "Escribí dos soluciones en Java para detectar duplicados en un vector. La primera tiene que usar 
 * dos ciclos anidados for, y la segunda tiene que usar la estructura HashSet. Comentá muy bien el código y, 
 * al final, incluí una comparación de ambas soluciones analizando su complejidad temporal y espacial."
 *
 * COMPARACIÓN:
 * 1. Solución Anidada:
 *    - Complejidad Temporal: O(n^2) debido a los dos ciclos iterando sobre el vector.
 *    - Complejidad Espacial: O(1) ya que no usa memoria extra.
 * 2. Solución HashSet:
 *    - Complejidad Temporal: O(n) ya que insertar y buscar en un HashSet toma O(1) en promedio.
 *    - Complejidad Espacial: O(n) porque en el peor caso se guardan todos los elementos en el HashSet.
 */

import java.util.HashSet;

public class Ejercicio4_Duplicados {
    public static void main(String[] args) {
        int[] vector = {4, 5, 9, 2, 5, 1};

        System.out.println("--- Solución 1: Ciclos Anidados ---");
        boolean hayDuplicado1 = false;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    System.out.println("Duplicado encontrado: " + vector[i]);
                    hayDuplicado1 = true;
                }
            }
        }
        if (!hayDuplicado1) System.out.println("No hay duplicados.");

        System.out.println("\n--- Solución 2: HashSet ---");
        HashSet<Integer> vistos = new HashSet<>();
        boolean hayDuplicado2 = false;
        for (int num : vector) {
            // add() retorna false si el elemento ya existía en el Set
            if (!vistos.add(num)) {
                System.out.println("Duplicado encontrado: " + num);
                hayDuplicado2 = true;
            }
        }
        if (!hayDuplicado2) System.out.println("No hay duplicados.");
    }
}
