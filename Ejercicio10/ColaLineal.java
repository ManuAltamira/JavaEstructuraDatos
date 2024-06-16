package Ejercicio10;

public class ColaLineal {
    private static final int MAXTAMQ = 49;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;
    
    public ColaLineal() {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }
    
    // operaciones de modificación de la cola
    public void insertar(Object elemento) throws Exception {
        if (!colaLlena()) {
            listaCola[++fin] = elemento;
        }
        else
            throw new Exception("Overflow en la cola");
    }
    public void quitar_correccion() {
        int i, j;
        for (i=frente, j=0; i<=fin; i++, j++) {
            listaCola[j] = listaCola[i];
        }
        frente = 0;
        listaCola[j] = null;
        fin = --j;
    }
    public Object quitar() throws Exception {
        if (!colaVacia()) {
            //return listaCola[frente++];
            Object aux = listaCola[frente++];
            quitar_correccion();
            return aux;
        }
        else
            throw new Exception("Cola vacia ");
    }
    
    //vacía la cola
    public void borrarCola() {
        frente = 0;
        fin = -1;
    }

    // acceso a la cola
    public Object frenteCola() throws Exception {
        if (!colaVacia()) {
            return listaCola[frente];
        }
        else
            throw new Exception("Cola vacia ");
    }
    
    // métodos de verificación del estado de la cola
    public boolean colaVacia() {
        return frente > fin;
    }
    public boolean colaLlena() {
        return fin == MAXTAMQ-1;
    }
}