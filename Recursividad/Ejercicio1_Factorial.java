/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que resuelva el factorial de un número.
 * Este problema puede resolverse recursivamente porque matemáticamente n! = n * (n-1)!.
 * El caso base es n == 0 o n == 1, porque en ambos casos el resultado por definición es 1.
 * El caso recursivo es n * factorial(n - 1), porque en cada llamada se reduce el número n acercándose a 1.
 * La función debe devolver un número entero con el factorial calculado.
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: n = 0
 * - caso 2: n = 1
 * - caso 3: n = 5
 *
 

public class Ejercicio1_Factorial {
    public static int factorial(int n) {
        // Caso base: si n es 0 o 1, termina la recursión
        if (n == 0 || n == 1) {
            return 1; // La pila de llamadas empieza a resolverse desde acá devolviendo 1
        }
        // Caso recursivo: n * factorial(n-1)
        // Ejemplo de pila para n=3: 3 * factorial(2) -> 2 * factorial(1) -> retorna 1, se resuelve 2*1=2, luego 3*2=6.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (n=0): " + factorial(0)); // Esperado: 1
        System.out.println("Caso 2 (n=1): " + factorial(1)); // Esperado: 1
        System.out.println("Caso 3 (n=5): " + factorial(5)); // Esperado: 120
    }
}
