/*
 * PROMPT INICIAL:
 * Necesito un programa en Java que reciba una expresión matemática y verifique si los paréntesis están balanceados. 
 * Para esto usaré una pila: cada vez que encuentre un paréntesis de apertura '(', lo guardo en la pila (push). 
 * Cuando encuentre uno de cierre ')', saco un elemento de la pila (pop). 
 * Si intento hacer pop y está vacía, o si al terminar de leer la expresión la pila no está vacía, 
 * significa que los paréntesis están desbalanceados.
 * Ajustes al prompt: Se agregó la validación final para comprobar que no queden paréntesis sin cerrar.
 */
import java.util.Stack;

public class Ejercicio3_BalanceoParentesis {
    public static boolean esValido(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "(5 + 3) * (2 + 1)";
        String exp2 = "(5 + 3)) * (2 + 1";
        System.out.println(exp1 + " -> " + (esValido(exp1) ? "válido" : "inválido"));
        System.out.println(exp2 + " -> " + (esValido(exp2) ? "válido" : "inválido"));
    }
}
