/*
 * PROMPT INICIAL:
 * Quiero implementar un programa en Java que ordene un arreglo de nombres (Strings) alfabéticamente usando Selection Sort.
 * El razonamiento del algoritmo es encontrar el menor (alfabéticamente el primero) en cada pasada.
 * A diferencia de los números que usan '>' o '<', aquí cambia la comparación: para ordenar textos se debe utilizar 
 * el método compareTo(), que devuelve un número menor a 0 si una cadena va antes que la otra.
 * Recibe el arreglo: {"Lucia", "Ana", "Pedro", "Juan"}.
 * Debe mostrar el arreglo antes y después de ordenarlo.
 */
import java.util.Arrays;

public class Ejercicio4_SeleccionNombres {
    public static void main(String[] args) {
        String[] nombres = {"Lucia", "Ana", "Pedro", "Juan"};
        System.out.println("Antes: " + Arrays.toString(nombres));
        
        int n = nombres.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Usamos compareTo para comparar textos. Si es negativo, nombres[j] es menor (va antes)
                if (nombres[j].compareTo(nombres[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Intercambio
            String temp = nombres[minIdx];
            nombres[minIdx] = nombres[i];
            nombres[i] = temp;
        }
        System.out.println("Después: " + Arrays.toString(nombres));
    }
}
