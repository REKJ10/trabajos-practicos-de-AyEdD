/*
 * PROMPT INICIAL:
 * Quiero implementar en Java una función recursiva que invierta un String.
 * Este problema puede resolverse recursivamente tomando el primer carácter y poniéndolo al final.
 * El caso base es si la cadena está vacía o tiene longitud 1, porque en esos casos ya está invertida (devuelve la misma).
 * El caso recursivo es invertir(cadena.substring(1)) + cadena.charAt(0), porque se separa el primer carácter del resto, se reduce la cadena enviando el resto, y al volver de la recursión se reconstruye el resultado colocando la letra original al final.
 * La función debe devolver la nueva cadena invertida.
 * Quiero que el código tenga comentarios explicando la lógica y se pruebe con:
 * - caso 1: 'hola'
 * - caso 2: 'a'
 * - caso 3: '' (vacío)
 */

public class Ejercicio8_InvertirPalabra {
    public static String invertir(String str) {
        // Caso base: cadena vacía o de 1 carácter
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Caso recursivo: enviamos el resto de la cadena y concatenamos el primer carácter al final
        // Pila 'abc': inv('bc') + 'a' -> inv('c') + 'b' -> retorna 'c'. Resuelve: 'cb', luego 'cba'.
        return invertir(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Caso 1 ('hola'): " + invertir("hola")); // Esperado: aloh
        System.out.println("Caso 2 ('a'): " + invertir("a")); // Esperado: a
        System.out.println("Caso 3 (''): " + invertir("")); // Esperado: 
    }
}
