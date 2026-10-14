/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que determine si una palabra es palíndromo.
 * Este problema puede resolverse recursivamente porque podemos revisar los extremos.
 * El caso base es cuando la longitud de la cadena es 0 o 1, lo cual significa que ya terminamos de revisar con éxito y devuelve true.
 * El caso recursivo compara el primer y último carácter. Si son distintos, devuelve false inmediatamente. Si son iguales, se reduce el problema eliminando los extremos con substring(1, length - 1).
 * La función debe devolver un booleano.
 * Quiero que el código tenga comentarios y se pruebe con:
 * - caso 1: 'neuquen'
 * - caso 2: 'hola'
 * - caso 3: 'a'
 */

public class Ejercicio9_Palindromo {
    public static boolean esPalindromo(String str) {
        // Caso base: 0 o 1 caracteres (es palíndromo por defecto)
        if (str.length() <= 1) {
            return true;
        }
        // Condición de quiebre inmediato
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Caso recursivo: enviamos la palabra sin sus extremos
        // Pila 'ana': 'a'=='a', llama esPalindromo('n') -> devuelve true.
        return esPalindromo(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 ('neuquen'): " + esPalindromo("neuquen")); // Esperado: true
        System.out.println("Caso 2 ('hola'): " + esPalindromo("hola")); // Esperado: false
        System.out.println("Caso 3 ('a'): " + esPalindromo("a")); // Esperado: true
    }
}
