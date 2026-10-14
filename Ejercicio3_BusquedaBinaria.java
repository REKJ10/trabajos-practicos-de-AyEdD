/*
 * PROMPT SIMULADO:
 * "Armame un algoritmo en Java de búsqueda binaria para un vector ordenado. Esta estrategia es mucho 
 * más eficiente que la búsqueda lineal porque al estar los datos ordenados, podemos ir descartando la 
 * mitad de los elementos en cada paso, logrando una complejidad de O(log n). Necesito que el código 
 * muestre paso a paso por consola cómo van cambiando las variables de inicio, fin y medio en cada iteración."
 */

public class Ejercicio3_BusquedaBinaria {
    public static void main(String[] args) {
        int[] vectorOrdenado = {1, 3, 5, 7, 9, 11, 13, 15};
        int objetivo = 11;
        
        int inicio = 0;
        int fin = vectorOrdenado.length - 1;
        boolean encontrado = false;

        System.out.println("Iniciando búsqueda binaria del elemento: " + objetivo);

        // Mientras el rango de búsqueda sea válido
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; // Calculamos el punto medio
            
            System.out.println("-> Inicio: " + inicio + " | Fin: " + fin + " | Medio: " + medio + " (Valor: " + vectorOrdenado[medio] + ")");

            if (vectorOrdenado[medio] == objetivo) {
                System.out.println("¡Elemento encontrado en el índice " + medio + "!");
                encontrado = true;
                break;
            } else if (vectorOrdenado[medio] < objetivo) {
                inicio = medio + 1; // Descartamos la mitad izquierda
            } else {
                fin = medio - 1; // Descartamos la mitad derecha
            }
        }

        if (!encontrado) {
            System.out.println("Elemento no encontrado.");
        }
    }
}
