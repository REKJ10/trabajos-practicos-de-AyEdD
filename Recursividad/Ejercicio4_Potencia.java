/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que calcule una potencia sin usar Math.pow.
 * Este problema puede resolverse recursivamente porque una potencia (base^exp) puede verse como multiplicaciones sucesivas de la base (base * base^(exp-1)).
 * El caso base es exponente == 0, porque por definición todo número elevado a 0 es 1.
 * El caso recursivo es base * potencia(base, exponente - 1), porque en cada llamada se reduce el exponente en 1.
 * La función debe devolver el valor de la potencia en cada caso.
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: 2 ^ 3
 * - caso 2: 5 ^ 0
 * - caso 3: 3 ^ 2
 */

public class Ejercicio4_Potencia {
    public static int potencia(int base, int exponente) {
        // Caso base: exponente es 0
        if (exponente == 0) {
            return 1; // Fin de las llamadas, devuelve 1 para no anular la multiplicación
        }
        // Caso recursivo: multiplica la base y reduce el exponente
        // Pila 2^3: 2 * pot(2,2) -> 2 * pot(2,1) -> 2 * pot(2,0) -> retorna 1.
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (2^3): " + potencia(2, 3)); // Esperado: 8
        System.out.println("Caso 2 (5^0): " + potencia(5, 0)); // Esperado: 1
        System.out.println("Caso 3 (3^2): " + potencia(3, 2)); // Esperado: 9
    }
}
