/*
 * PROMPT INICIAL:
 * Implementar un validador de paréntesis balanceados usando una Pila enlazada.
 * Se usa una pila para guardar los paréntesis de apertura '('. Cada vez que se lee un cierre ')', 
 * se verifica el tope de la pila. Si la pila está vacía (hay un cierre sin apertura previa) o si al 
 * terminar de procesar toda la expresión quedan aperturas en la pila, la expresión es inválida. 
 * La política LIFO asegura que el último paréntesis abierto sea el primero en cerrarse.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
public class Ejercicio7_Parentesis {
    public static boolean estaBalanceado(String expresion) {
        Ejercicio3_PilaGenerica<Character> pila = new Ejercicio3_PilaGenerica<>();
        
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.apilar(c);
            } else if (c == ')') {
                if (pila.estaVacia()) return false;
                pila.desapilar();
            }
        }
        return pila.estaVacia();
    }

    public static void main(String[] args) {
        System.out.println("Válido: " + estaBalanceado("(2 + 3) * (5 - 1)")); // true
        System.out.println("Inválido: " + estaBalanceado("())( ")); // false
    }
}
