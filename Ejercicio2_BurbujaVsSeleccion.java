/*
 * PROMPT INICIAL:
 * Quiero implementar dos métodos en Java: bubbleSort(int[] array) y selectionSort(int[] array).
 * Ambos deben ordenar copias del mismo arreglo.
 * El razonamiento principal que diferencia ambos métodos es: Burbuja compara vecinos repetidamente, 
 * lo que genera muchos intercambios; en cambio, Selección busca directamente el elemento menor de la parte 
 * no ordenada y hace un solo intercambio por pasada.
 * El programa recibe un arreglo de enteros, lo copia y ejecuta ambos métodos.
 * Debe mostrar por pantalla la cantidad de comparaciones e intercambios que realiza cada algoritmo.
 * Debe incluir comentarios explicativos.
 */
import java.util.Arrays;

public class Ejercicio2_BurbujaVsSeleccion {
    public static void bubbleSort(int[] array) {
        int comparaciones = 0, intercambios = 0, n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambios++;
                }
            }
        }
        System.out.println("Burbuja - Comparaciones: " + comparaciones + ", Intercambios: " + intercambios);
    }

    public static void selectionSort(int[] array) {
        int comparaciones = 0, intercambios = 0, n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = array[minIdx];
                array[minIdx] = array[i];
                array[i] = temp;
                intercambios++;
            }
        }
        System.out.println("Seleccion - Comparaciones: " + comparaciones + ", Intercambios: " + intercambios);
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11};
        bubbleSort(Arrays.copyOf(original, original.length));
        selectionSort(Arrays.copyOf(original, original.length));
    }
}
