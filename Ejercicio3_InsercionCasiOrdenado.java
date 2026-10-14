/*
 * PROMPT INICIAL:
 * Quiero implementar Insertion Sort en Java sobre un arreglo casi ordenado: {1, 2, 3, 5, 4, 6, 7}.
 * El razonamiento de este algoritmo es ir insertando cada elemento en su posición correcta respecto a los anteriores. 
 * Insertion Sort funciona muy bien (se acerca a O(n)) cuando los datos están casi ordenados porque los 
 * desplazamientos necesarios hacia la derecha son mínimos (el bucle interno se corta rápido).
 * El programa debe contar y mostrar por pantalla cuántos desplazamientos (shifts) realiza.
 * Comentar el código y verificar la salida.
 */
import java.util.Arrays;

public class Ejercicio3_InsercionCasiOrdenado {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6, 7};
        int desplazamientos = 0;
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Movemos los elementos mayores que la llave una posición a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                desplazamientos++;
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
        System.out.println("Total de desplazamientos: " + desplazamientos);
    }
}
