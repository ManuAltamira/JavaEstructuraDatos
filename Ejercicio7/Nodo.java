package Ejercicio7;

public class Nodo {
    private int dato;
    private Nodo enlace;

    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = null;
    }
    public Nodo(int dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getEnlace() {
        return enlace;
    }
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
