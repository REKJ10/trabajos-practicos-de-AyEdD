/*
 * PROMPT SIMULADO:
 * "Dame un algoritmo en Java que encuentre el elemento más grande dentro de una matriz. Como la matriz 
 * no está ordenada, es estrictamente necesario recorrer todos y cada uno de los elementos para estar seguros 
 * de cuál es verdaderamente el mayor. Incluí el análisis de complejidad temporal y espacial en los comentarios."
 *
 * ANÁLISIS DE COMPLEJIDAD:
 * - Complejidad Temporal: O(n * m) donde n es el número de filas y m el de columnas, ya que hay que visitar cada elemento.
 * - Complejidad Espacial: O(1) porque solo necesitamos almacenar el valor máximo actual.
 */

public class Ejercicio9_MayorMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {12, 5, 23},
            {9, 45, 2},
            {7, 8, 19}
        };

        // Asumimos inicialmente que el primero es el mayor
        int mayor = matriz[0][0];

        // Recorremos toda la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Comparamos y actualizamos si encontramos uno mayor
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("El mayor elemento de la matriz es: " + mayor);
    }
}
