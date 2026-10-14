/*
 * PROMPT SIMULADO:
 * "Escribí en Java un algoritmo para calcular la suma de todos los elementos de una matriz. Vamos a recorrer 
 * la matriz usando dos ciclos anidados: el ciclo externo para las filas y el interno para las columnas. 
 * Explicame la complejidad de esto y hacé que el programa cuente y muestre la cantidad total de operaciones de suma."
 *
 * ANÁLISIS DE COMPLEJIDAD:
 * - Complejidad Temporal: O(f * c) (donde f son las filas y c las columnas), ya que recorremos cada celda una vez.
 * - Complejidad Espacial: O(1) porque solo usamos variables acumuladoras simples.
 */

public class Ejercicio8_SumarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sumaTotal = 0;
        int operaciones = 0;

        // Recorrido de filas (externo)
        for (int i = 0; i < matriz.length; i++) {
            // Recorrido de columnas (interno)
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j]; // Operación de suma
                operaciones++; // Contabilizamos la operación
            }
        }

        System.out.println("La suma de los elementos es: " + sumaTotal);
        System.out.println("Cantidad de operaciones realizadas: " + operaciones);
    }
}
