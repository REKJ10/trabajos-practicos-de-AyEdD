/*
 * PROMPT INICIAL:
 * Quiero un programa en Java que compare tres algoritmos simples: Bubble Sort, Selection Sort e Insertion Sort.
 * Se debe pasar una copia del mismo arreglo a cada uno.
 * El programa debe mostrar el arreglo ordenado, la cantidad de comparaciones y la cantidad de intercambios (o desplazamientos).
 * En la salida se observará que aunque logran el mismo resultado final, sus estrategias difieren drásticamente 
 * en el trabajo interno (Burbuja mueve todo constantemente, Selección hace pocos intercambios, Inserción hace desplazamientos eficientes).
 */
import java.util.Arrays;

public class Ejercicio9_ComparacionSimples {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        burbuja(Arrays.copyOf(arr, arr.length));
        seleccion(Arrays.copyOf(arr, arr.length));
        insercion(Arrays.copyOf(arr, arr.length));
    }

    public static void burbuja(int[] arr) {
        int comp = 0, inter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                comp++;
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t;
                    inter++;
                }
            }
        }
        System.out.println("Burbuja -> Comp: " + comp + ", Intercambios: " + inter + " | " + Arrays.toString(arr));
    }

    public static void seleccion(int[] arr) {
        int comp = 0, inter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                comp++;
                if (arr[j] < arr[min]) min = j;
            }
            if (min != i) {
                int t = arr[i]; arr[i] = arr[min]; arr[min] = t;
                inter++;
            }
        }
        System.out.println("Selección -> Comp: " + comp + ", Intercambios: " + inter + " | " + Arrays.toString(arr));
    }

    public static void insercion(int[] arr) {
        int comp = 0, desp = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            comp++;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                desp++;
                j--;
                if (j >= 0) comp++; 
            }
            arr[j + 1] = key;
        }
        System.out.println("Inserción -> Comp: " + comp + ", Desplazamientos: " + desp + " | " + Arrays.toString(arr));
    }
}
