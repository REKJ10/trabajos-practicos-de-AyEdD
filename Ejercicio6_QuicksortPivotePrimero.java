/*
 * PROMPT INICIAL:
 * Quiero implementar Quicksort en Java usando SIEMPRE el primer elemento como pivote.
 * El algoritmo sigue el paradigma Divide y Vencerás utilizando recursividad: particiona el arreglo aislando un pivote, 
 * manda los menores a su izquierda y los mayores a su derecha, y luego se llama a sí mismo para ordenar 
 * el subarreglo izquierdo y el derecho.
 * El programa debe mostrar por pantalla: el pivote elegido, los elementos que quedan en el subarreglo izquierdo, 
 * los del derecho, y finalmente el arreglo ordenado completo.
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio6_QuicksortPivotePrimero {
    // Usamos List para facilitar la impresión didáctica de particiones
    public static List<Integer> quicksort(List<Integer> lista) {
        if (lista.size() <= 1) {
            return lista;
        }

        int pivote = lista.get(0); // Pivote como primer elemento
        List<Integer> menores = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) <= pivote) {
                menores.add(lista.get(i));
            } else {
                mayores.add(lista.get(i));
            }
        }

        System.out.println("Pivote: " + pivote + " | Izquierda: " + menores + " | Derecha: " + mayores);

        // Llamadas recursivas (Divide y Vencerás)
        List<Integer> ordenado = new ArrayList<>();
        ordenado.addAll(quicksort(menores));
        ordenado.add(pivote);
        ordenado.addAll(quicksort(mayores));

        return ordenado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(4, 2, 7, 1, 3, 6);
        List<Integer> resultado = quicksort(numeros);
        System.out.println("Arreglo final ordenado: " + resultado);
    }
}
