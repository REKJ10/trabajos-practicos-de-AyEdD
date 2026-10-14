/*
 * PROMPT SIMULADO:
 * "Quiero un algoritmo en Java que cuente cuántas veces aparece un valor específico en un vector. 
 * El algoritmo necesita recorrer completamente el vector sí o sí porque, al no estar ordenado, 
 * el valor puede estar repetido en cualquier posición. Dame el código comentado y detallame 
 * su complejidad temporal (que debería ser O(n)) y espacial (O(1))."
 */

public class Ejercicio5_ContarOcurrencias {
    public static void main(String[] args) {
        int[] vector = {3, 7, 3, 1, 9, 3, 2};
        int objetivo = 3;
        int contador = 0;

        // Recorremos todo el vector, lo cual es obligatorio
        for (int i = 0; i < vector.length; i++) {
            // Si el elemento coincide, incrementamos el contador
            if (vector[i] == objetivo) {
                contador++;
            }
        }

        System.out.println("El número " + objetivo + " aparece " + contador + " veces.");
    }
}
