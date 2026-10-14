/*
 * PROMPT INICIAL:
 * Quiero implementar MergeSort en Java.
 * El razonamiento (Divide y Vencerás) se divide en dos fases: primero, divide el arreglo por la mitad recursivamente 
 * hasta que los subarreglos tengan tamaño 1 (condición de corte). Luego, fusiona (merge) esos subarreglos ordenándolos 
 * mientras los combina.
 * El programa debe imprimir cómo se divide el arreglo, cuándo llega al caso base (tamaño 1) y cómo se van fusionando.
 */
import java.util.Arrays;

public class Ejercicio8_MergeSortPasoAPaso {
    public static void mergeSort(int[] arr, int izq, int der) {
        if (izq == der) {
            System.out.println("Condición de corte alcanzada (tamaño 1): [" + arr[izq] + "]");
            return;
        }
        if (izq < der) {
            int medio = (izq + der) / 2;
            System.out.println("Dividiendo: " + Arrays.toString(Arrays.copyOfRange(arr, izq, der + 1)) + " en mitad izq hasta " + arr[medio] + " y mitad der desde " + arr[medio+1]);
            
            mergeSort(arr, izq, medio);
            mergeSort(arr, medio + 1, der);
            
            merge(arr, izq, medio, der);
        }
    }

    public static void merge(int[] arr, int izq, int medio, int der) {
        int[] temp = new int[der - izq + 1];
        int i = izq, j = medio + 1, k = 0;

        while (i <= medio && j <= der) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= medio) temp[k++] = arr[i++];
        while (j <= der) temp[k++] = arr[j++];

        for (i = izq; i <= der; i++) {
            arr[i] = temp[i - izq];
        }
        System.out.println("Fusionando subarreglos, resultado temporal: " + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Arreglo Final: " + Arrays.toString(arr));
    }
}
