/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que cuente los dígitos de un número entero positivo.
 * Este problema puede resolverse recursivamente reduciendo el número usando división entera (/ 10).
 * El caso base es cuando el número es menor que 10, porque en ese punto sabemos que tiene un solo dígito (devuelve 1).
 * El caso recursivo es 1 + contarDigitos(n / 10), porque en cada llamada "quitamos" un dígito de la derecha.
 * La función debe devolver la cantidad total de llamadas (el contador).
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: n = 5
 * - caso 2: n = 123
 * - caso 3: n = 9876
 */

public class Ejercicio6_ContarDigitos {
    public static int contar(int n) {
        // Caso base: el número tiene un solo dígito
        if (n < 10) {
            return 1;
        }
        // Caso recursivo: sumamos 1 dígito encontrado y llamamos con el número sin su último dígito
        // Pila para 123: 1 + contar(12) -> 1 + contar(1) -> retorna 1. Total: 1+1+1 = 3.
        return 1 + contar(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (5): " + contar(5)); // Esperado: 1
        System.out.println("Caso 2 (123): " + contar(123)); // Esperado: 3
        System.out.println("Caso 3 (9876): " + contar(9876)); // Esperado: 4
    }
}
