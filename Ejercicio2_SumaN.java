/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que sume los números desde n hasta 1.
 * Este problema puede resolverse recursivamente porque suma(n) puede pensarse como n + suma(n - 1).
 * El caso base es n == 0 (o n == 1), porque es el caso más simple que devuelve directamente 0 (o 1) sin sumar nada más.
 * El caso recursivo es n + suma(n - 1), porque en cada llamada se reduce n restándole 1.
 * La función debe devolver la sumatoria total.
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: n = 0
 * - caso 2: n = 5
 * - caso 3: n = 10
 */

public class Ejercicio2_SumaN {
    public static int suma(int n) {
        // Caso base: el problema más simple. Si n es 0, no hay nada que sumar.
        if (n == 0) {
            return 0; // Fin de la pila de llamadas
        }
        // Caso recursivo: sumamos n y llamamos recursivamente con n-1
        // Pila para n=3: 3 + suma(2) -> 2 + suma(1) -> 1 + suma(0) -> retorna 0.
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (n=0): " + suma(0)); // Esperado: 0
        System.out.println("Caso 2 (n=5): " + suma(5)); // Esperado: 15
        System.out.println("Caso 3 (n=10): " + suma(10)); // Esperado: 55
    }
}
