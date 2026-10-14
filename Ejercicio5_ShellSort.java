/*
 * PROMPT INICIAL:
 * Quiero implementar ShellSort en Java.
 * El razonamiento es una mejora de Insertion Sort: en lugar de comparar elementos adyacentes, 
 * ShellSort compara elementos separados por un 'gap' (salto). Esto permite mover elementos muy desubicados 
 * a su posición casi final rápidamente, reduciendo los desplazamientos totales.
 * El programa debe recibir un arreglo, y mostrar por pantalla el valor del gap en cada etapa y 
 * el estado del arreglo luego de cada pasada (es decir, cada vez que cambia el gap).
 * Comentar el código adecuadamente.
 */
import java.util.Arrays;

public class Ejercicio5_ShellSort {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        int n = arr.length;
        System.out.println("Original: " + Arrays.toString(arr));

        // Iniciamos con un gap grande y lo vamos reduciendo a la mitad
        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println(">> Aplicando gap = " + gap);
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
            System.out.println("Estado: " + Arrays.toString(arr));
        }
    }
}
