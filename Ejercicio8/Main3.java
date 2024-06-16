package Ejercicio8;

public class Main3 {
    public static void main(String[] args) throws Exception {
        ColaLineal cola = new ColaLineal();
        PilaLineal pila = new PilaLineal();

        cola.insertar(Integer.valueOf(1));
        cola.insertar(Integer.valueOf(2));
        cola.insertar(Integer.valueOf(3));
        cola.insertar(Integer.valueOf(4));
        cola.insertar(Integer.valueOf(5));
        cola.quitar();
        cola.quitar();
        cola.quitar();
        cola.quitar();

        pila.insertar(Integer.valueOf(1));
        pila.insertar(Integer.valueOf(2));
        pila.insertar(Integer.valueOf(3));
        pila.insertar(Integer.valueOf(4));
        pila.insertar(Integer.valueOf(5));
        pila.quitar();
        pila.quitar();
        pila.quitar();
        pila.quitar();
    }
}
