/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una multiplicación recursiva sin usar el operador *.
 * Este problema puede resolverse recursivamente porque una multiplicación a * b equivale a sumar el valor 'a' repetidas veces ('b' veces).
 * El caso base es cuando b == 0, porque cualquier número multiplicado por 0 da 0.
 * El caso recursivo es a + multiplicar(a, b - 1), porque en cada llamada reducimos el parámetro b (el contador de sumas).
 * La función debe devolver el resultado entero de las sumas.
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: 5 x 3
 * - caso 2: 7 x 0
 * - caso 3: 0 x 4
 */

public class Ejercicio3_Multiplicacion {
    public static int multiplicar(int a, int b) {
        // Caso base: uno de los factores es 0
        if (b == 0) {
            return 0; // Termina la recursión y empieza el desapilado
        }
        // Caso recursivo: se suma 'a' y se decrementa 'b'
        // Pila 5x2: 5 + mult(5,1) -> 5 + mult(5,0) -> 0. Resuelve: 5+0=5, luego 5+5=10.
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (5 x 3): " + multiplicar(5, 3)); // Esperado: 15
        System.out.println("Caso 2 (7 x 0): " + multiplicar(7, 0)); // Esperado: 0
        System.out.println("Caso 3 (0 x 4): " + multiplicar(0, 4)); // Esperado: 0
    }
}
