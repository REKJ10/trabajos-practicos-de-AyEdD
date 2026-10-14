/*
 * PROMPT SIMULADO:
 * "Hacé un algoritmo en Java que determine si dos vectores son exactamente iguales (mismo tamaño y 
 * mismos elementos en las mismas posiciones). El ciclo tiene que cortarse apenas encuentre una diferencia. 
 * Incluí en los comentarios un análisis del mejor caso, peor caso y caso promedio."
 *
 * ANÁLISIS DE COMPLEJIDAD:
 * - Mejor caso: O(1). Los vectores tienen distinto tamaño (se descarta de inmediato) o difieren en el primer elemento.
 * - Peor caso: O(n). Los vectores son idénticos o difieren recién en el último elemento.
 * - Caso promedio: O(k) donde k es el índice de la primera diferencia, en promedio O(n).
 */

public class Ejercicio6_CompararVectores {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {1, 2, 3, 9, 5};

        boolean sonIguales = true;

        // Verificación rápida de longitud
        if (v1.length != v2.length) {
            sonIguales = false;
        } else {
            // Comparamos elemento a elemento
            for (int i = 0; i < v1.length; i++) {
                if (v1[i] != v2[i]) {
                    sonIguales = false;
                    break; // Cortamos ni bien encontramos una diferencia
                }
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son distintos.");
        }
    }
}
