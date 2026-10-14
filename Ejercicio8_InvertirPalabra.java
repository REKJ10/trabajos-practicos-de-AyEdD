/*
 * PROMPT INICIAL:
 * Implementar un programa que invierta una palabra utilizando una Pila enlazada de caracteres.
 * La política LIFO permite invertir el orden de manera natural: si apilamos las letras en el orden en que 
 * aparecen (ej. a-l-g-o...), la última letra de la palabra quedará en el tope de la pila. Al desapilar 
 * secuencialmente, extraeremos las letras desde el final hacia el principio, reconstruyendo la cadena invertida.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
public class Ejercicio8_InvertirPalabra {
    public static String invertir(String palabra) {
        Ejercicio3_PilaGenerica<Character> pila = new Ejercicio3_PilaGenerica<>();
        
        // Apilar
        for (char c : palabra.toCharArray()) {
            pila.apilar(c);
        }
        
        // Desapilar y reconstruir
        StringBuilder invertida = new StringBuilder();
        while (!pila.estaVacia()) {
            invertida.append(pila.desapilar());
        }
        return invertida.toString();
    }

    public static void main(String[] args) {
        System.out.println("algoritmo -> " + invertir("algoritmo"));
    }
}
