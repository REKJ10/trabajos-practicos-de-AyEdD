/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que sume los dígitos de un número entero positivo.
 * Este problema puede resolverse recursivamente extrayendo dígitos.
 * El caso base es cuando n < 10, porque si es un solo dígito, la suma de sus dígitos es el mismo número.
 * El caso recursivo es (n % 10) + sumarDigitos(n / 10), porque obtenemos el último dígito con el módulo y reducimos el número con la división entera.
 * La función debe devolver la suma combinada.
 * Quiero que el código tenga comentarios explicando el caso base, el caso recursivo y la pila de llamadas.
 * También quiero probarlo con estos casos:
 * - caso 1: n = 4
 * - caso 2: n = 123
 * - caso 3: n = 987
 */

public class Ejercicio7_SumarDigitos {
    public static int sumarDigitos(int n) {
        // Caso base: número de 1 dígito
        if (n < 10) {
            return n;
        }
        // Caso recursivo: último dígito + suma del resto
        // Pila para 123: (123%10 = 3) + sumarDigitos(12) -> (12%10 = 2) + sumarDigitos(1) -> retorna 1.
        // Se resuelve: 1, luego 2+1=3, luego 3+3=6.
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 (4): " + sumarDigitos(4)); // Esperado: 4
        System.out.println("Caso 2 (123): " + sumarDigitos(123)); // Esperado: 6
        System.out.println("Caso 3 (987): " + sumarDigitos(987)); // Esperado: 24
    }
}
