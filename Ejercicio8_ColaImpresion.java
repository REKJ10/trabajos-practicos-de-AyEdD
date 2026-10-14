/*
 * PROMPT INICIAL:
 * Quiero un simulador de cola de impresión en Java usando un arreglo. 
 * Cada documento tiene nombre y cantidad de páginas. 
 * Una cola representa correctamente este orden porque funciona como FIFO: el primer documento 
 * que se envía a la impresora es el primero que se debe procesar e imprimir, manteniendo el orden de llegada.
 * Ajustes al prompt: Ninguno.
 */
class Documento {
    String nombre;
    int paginas;
    public Documento(String n, int p) { nombre = n; paginas = p; }
    public String toString() { return nombre + " (" + paginas + " pags)"; }
}

public class Ejercicio8_ColaImpresion {
    private Documento[] cola;
    private int front, rear, size;

    public Ejercicio8_ColaImpresion(int capacidad) {
        cola = new Documento[capacidad];
        front = 0; rear = -1; size = 0;
    }

    public void enviarAImprimir(Documento doc) {
        if (size == cola.length) return;
        cola[++rear] = doc;
        size++;
        System.out.println("Enviado a cola: " + doc);
    }

    public void imprimir() {
        if (size == 0) return;
        System.out.println("Imprimiendo: " + cola[front++]);
        size--;
    }

    public static void main(String[] args) {
        Ejercicio8_ColaImpresion imp = new Ejercicio8_ColaImpresion(5);
        imp.enviarAImprimir(new Documento("Tesis.pdf", 50));
        imp.enviarAImprimir(new Documento("Foto.jpg", 1));
        imp.imprimir();
        imp.imprimir();
    }
}
