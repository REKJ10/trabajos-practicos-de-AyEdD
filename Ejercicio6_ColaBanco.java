/*
 * PROMPT INICIAL:
 * Implementar una cola de atención para un banco usando una Cola enlazada genérica de objetos 'ClienteBanco'.
 * La estructura adecuada es una cola porque la atención bancaria funciona bajo el principio de justicia FIFO: 
 * la primera persona en llegar debe ser la primera en ser atendida. 
 * El orden de llegada se representa insertando siempre por el 'tail' (final de la fila) y extrayendo por el 'head' (frente).
 * 
 * Ajustes realizados luego de la primera respuesta de OpenCode:
 * Ninguno.
 */
class ClienteBanco {
    String nombre;
    int turno;
    String motivo;
    ClienteBanco(String n, int t, String m) { nombre = n; turno = t; motivo = m; }
    public String toString() { return "Turno " + turno + " - " + nombre + " (" + motivo + ")"; }
}

public class Ejercicio6_ColaBanco {
    private Ejercicio4_ColaGenerica<ClienteBanco> fila;

    public Ejercicio6_ColaBanco() {
        fila = new Ejercicio4_ColaGenerica<>();
    }

    public void agregarCliente(ClienteBanco c) {
        fila.encolar(c);
        System.out.println("Llegó: " + c);
    }

    public void atenderProximo() {
        ClienteBanco c = fila.desencolar();
        if (c != null) System.out.println("Atendiendo a: " + c);
        else System.out.println("No hay clientes en fila.");
    }

    public static void main(String[] args) {
        Ejercicio6_ColaBanco banco = new Ejercicio6_ColaBanco();
        banco.agregarCliente(new ClienteBanco("Pedro", 1, "Caja"));
        banco.agregarCliente(new ClienteBanco("Maria", 2, "Comercial"));
        banco.atenderProximo();
    }
}
