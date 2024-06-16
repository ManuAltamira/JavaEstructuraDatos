package Ejercicio6;

public class Nodo {
    private Elemento dato;
    private Nodo enlace;

    public Nodo(Elemento dato) {
        this.dato = dato;
        this.enlace = null;
    }
    public Nodo(Elemento dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public Elemento getDato() {
        return dato;
    }
    public void setDato(Elemento dato) {
        this.dato = dato;
    }
    public Nodo getEnlace() {
        return enlace;
    }
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
