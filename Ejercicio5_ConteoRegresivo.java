/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que imprima un conteo desde n hasta 0.
 * Este problema puede resolverse recursivamente imprimiendo n y llamándose de nuevo.
 * El caso base es n < 0, porque ahí terminamos el conteo.
 * El caso recursivo es llamar a conteo(n - 1), porque así nos acercamos al 0. Si se usara n + 1, se alejaría y causaría un bucle infinito (StackOverflow).
 * La función no necesariamente devuelve un valor (será void).
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: n = 5
 * - caso 2: n = 0
 */

public class Ejercicio5_ConteoRegresivo {
    public static void conteo(int n) {
        // Caso base: cuando llegamos a un valor menor a 0, la función simplemente hace return para salir
        if (n < 0) {
            return; // Corta la ejecución
        }
        // Imprimimos el valor actual
        System.out.print(n + " ");
        
        // Caso recursivo: llama a la función reduciendo n.
        // Pila para n=2: imprime 2, llama conteo(1) -> imprime 1, llama conteo(0) -> imprime 0, llama conteo(-1) -> corta.
        conteo(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Caso 1 (n=5): ");
        conteo(5);
        System.out.println();
        
        System.out.print("Caso 2 (n=0): ");
        conteo(0);
        System.out.println();
    }
}
