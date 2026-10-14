/*
 * PROMPT INICIAL:
 * Implementar una cola de impresión usando una Cola enlazada genérica de objetos 'TrabajoImpresion'.
 * Una impresora debe procesar los trabajos usando FIFO porque asegura equidad y predictibilidad: 
 * el usuario que envió su trabajo primero tiene derecho a que su documento se imprima primero, 
 * sin que trabajos posteriores interrumpan o se adelanten en la fila.
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
class TrabajoImpresion {
    String archivo;
    int paginas;
    String usuario;
    TrabajoImpresion(String a, int p, String u) { archivo = a; paginas = p; usuario = u; }
    public String toString() { return archivo + " (" + paginas + " págs) - " + usuario; }
}

public class Ejercicio9_ColaImpresion {
    private Ejercicio4_ColaGenerica<TrabajoImpresion> cola;

    public Ejercicio9_ColaImpresion() { cola = new Ejercicio4_ColaGenerica<>(); }

    public void agregarTrabajo(TrabajoImpresion t) {
        cola.encolar(t);
        System.out.println("Trabajo encolado: " + t);
    }

    public void imprimirProximo() {
        TrabajoImpresion t = cola.desencolar();
        if (t != null) System.out.println("Imprimiendo: " + t);
        else System.out.println("Cola de impresión vacía.");
    }

    public static void main(String[] args) {
        Ejercicio9_ColaImpresion impresora = new Ejercicio9_ColaImpresion();
        impresora.agregarTrabajo(new TrabajoImpresion("TP.pdf", 5, "Alumno1"));
        impresora.imprimirProximo();
    }
}
