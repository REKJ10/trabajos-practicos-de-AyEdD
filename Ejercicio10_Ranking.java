/*
 * PROMPT INICIAL:
 * Quiero implementar un programa en Java que reciba un arreglo de objetos Jugador (con nombre y puntaje).
 * El programa debe ordenar el ranking de mayor a menor puntaje.
 * He elegido Insertion Sort como algoritmo más adecuado para este problema. Justifico la elección porque,
 * en escenarios reales de rankings, los jugadores suelen actualizar sus puntajes progresivamente y el arreglo 
 * se mantiene "casi ordenado". Insertion Sort es extremadamente eficiente para listas casi ordenadas (O(n)).
 * El programa debe imprimir el ranking resultante.
 */
import java.util.Arrays;

class Jugador {
    String nombre;
    int puntaje;

    Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return nombre + ": " + puntaje;
    }
}

public class Ejercicio10_Ranking {
    public static void main(String[] args) {
        Jugador[] ranking = {
            new Jugador("Ana", 1200),
            new Jugador("Pedro", 900),
            new Jugador("Lucia", 1500)
        };

        // Ordenamos con Insertion Sort (Mayor a Menor)
        for (int i = 1; i < ranking.length; i++) {
            Jugador key = ranking[i];
            int j = i - 1;
            
            // Cambiamos el signo a < para ordenar descendentemente
            while (j >= 0 && ranking[j].puntaje < key.puntaje) {
                ranking[j + 1] = ranking[j];
                j--;
            }
            ranking[j + 1] = key;
        }

        System.out.println("Ranking Final Ordenado:");
        for (Jugador j : ranking) {
            System.out.println(j);
        }
    }
}
