/*
 * PROMPT INICIAL:
 * Quiero implementar Quicksort en Java sobre un arreglo que YA está ordenado: {1, 2, 3, 4, 5, 6, 7}.
 * Debe usar el primer elemento como pivote.
 * Si elegimos siempre el primer elemento en un arreglo ya ordenado, el particionado es pésimo (quedan 0 a la izquierda y todos a la derecha), 
 * degradando el rendimiento a O(n^2). El programa debe contar y mostrar la cantidad de llamadas recursivas realizadas 
 * para evidenciar este mal rendimiento.
 */
public class Ejercicio7_QuicksortPeorCaso {
    static int llamadasRecursivas = 0;

    public static void quicksort(int[] arr, int inicio, int fin) {
        llamadasRecursivas++;
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);
            quicksort(arr, inicio, p - 1);
            quicksort(arr, p + 1, fin);
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[inicio]; // Primer elemento
        int izq = inicio + 1;
        int der = fin;

        while (izq <= der) {
            while (izq <= der && arr[izq] <= pivote) izq++;
            while (izq <= der && arr[der] > pivote) der--;
            if (izq < der) {
                int temp = arr[izq];
                arr[izq] = arr[der];
                arr[der] = temp;
            }
        }
        arr[inicio] = arr[der];
        arr[der] = pivote;
        return der;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        quicksort(numeros, 0, numeros.length - 1);
        System.out.println("Llamadas recursivas en el peor caso: " + llamadasRecursivas);
    }
}
