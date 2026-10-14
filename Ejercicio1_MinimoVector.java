/*
 * PROMPT:
 * necesito implementar en Java un algoritmo para encontrar el valor mínimo en un vector de enteros. 
 * La mejor estrategia es inicializar una variable con el primer elemento del vector e iterar desde el segundo elemento, 
 * comparando y actualizando el mínimo si encontramos uno menor. Esto es correcto porque nos asegura revisar todos los 
 * elementos una sola vez sin hacer trabajo extra. La complejidad temporal esperada es O(n) y la espacial O(1). 
 * Por favor, dame el código bien comentado y explicame por qué no hace falta ordenar el vector primero para encontrar el mínimo."
 *

public class Ejercicio1_MinimoVector {
    public static void main(String[] args) {
        int[] vector = {5, 3, 9, 1, 7};
        
        // Verificamos que el vector no esté vacío
        if (vector.length == 0) {
            System.out.println("El vector está vacío.");
            return;
        }

        // Asumimos que el primer elemento es el mínimo
        int minimo = vector[0];

        // Recorremos desde el segundo elemento (índice 1)
        for (int i = 1; i < vector.length; i++) {
            // Si encontramos un elemento menor, actualizamos la variable
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }

        System.out.println("El valor mínimo es: " + minimo);
    }
}
