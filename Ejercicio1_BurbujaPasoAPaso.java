/*
 * PROMPT INICIAL:
 * Quiero implementar en Java un programa que ordene un arreglo de números enteros usando Bubble Sort.
 * El razonamiento de este algoritmo es comparar elementos adyacentes y permutarlos si están en orden incorrecto. 
 * Por esta razón, en cada pasada completa, el elemento más grande restante se va desplazando (o "burbujeando") 
 * hacia su posición definitiva al final del arreglo.
 * El programa debe recibir un arreglo de enteros desordenado.
 * Debe mostrar por pantalla el arreglo original y, luego de cada pasada (bucle externo), el estado actual del arreglo.
 * El código debe estar comentado y verificarse visualmente imprimiendo el resultado final.
 */
import java.util.Arrays;

public class Ejercicio1_BurbujaPasoAPaso {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean intercambiado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambiado = true;
                }
            }
            System.out.println("Estado luego de la pasada " + (i + 1) + ": " + Arrays.toString(arr));
            if (!intercambiado) break; // Optimización si ya está ordenado
        }
    }
}
