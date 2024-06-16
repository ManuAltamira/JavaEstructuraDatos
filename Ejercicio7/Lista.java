package Ejercicio7;

public class Lista {
    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabeza(int dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.setEnlace(primero);
        primero = nuevo;

        return this;
    }

    public Lista insertarUltimo(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (primero == null)
            insertarCabeza(dato);
        else {
            Nodo actual = primero;
            while (actual.getEnlace() != null)
                actual = actual.getEnlace();
            actual.setEnlace(nuevo);
        }
        return this;
    }

    public Lista insertar(Nodo anterior, int dato) {
        Nodo nuevo = new Nodo(dato);
        
        nuevo.setEnlace( anterior.getEnlace() );
        anterior.setEnlace(nuevo);
        
        return this;
    }
    public Lista insertar(int anterior, int dato) {
        Nodo nuevo = new Nodo(dato);

        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato() == anterior)
                break;
            actual = actual.getEnlace();
        }
        
        nuevo.setEnlace( actual.getEnlace() );
        actual.setEnlace(nuevo);
        
        return this;
    }

    public Lista insertarOrdenada(int dato) {
        Nodo nuevo = new Nodo(dato);

        Nodo actual = primero;
        Nodo anterior = primero;
        while (actual != null) {
            if (actual.getDato() > nuevo.getDato())
                break;
            anterior = actual;
            actual = actual.getEnlace();
            if (actual == null)
                break;
        }

        if (anterior == null || (anterior.getDato() > nuevo.getDato())) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        else {
            nuevo.setEnlace( anterior.getEnlace() );
            anterior.setEnlace(nuevo);
        }
        
        return this;
    }

    public Nodo buscar(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.getEnlace())
            if (destino == indice.getDato())
            // ( destino.equals( indice.getDato() ) )
                return indice;
        return null;
    }

    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0)
            return null;
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i++)
            indice = indice.getEnlace();
        return indice;
    }

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        
        actual = primero;
        anterior = null;
        encontrado = false;
        
        while ( actual != null && !encontrado ) {
            encontrado = ( actual.getDato() == entrada );
            //con objetos: actual.getDato().equals(entrada)
            
            if ( !encontrado ) {
                anterior = actual;
                actual = actual.getEnlace();
            }
        }
        
        if ( actual != null ) {
            if ( actual == primero ) {
                primero = actual.getEnlace();
            }
            else {
                anterior.setEnlace( actual.getEnlace() );
            }
            actual = null;
        }
    }

    public void visualizar() {
        //Nodo actual = lista.getPrimero();
        Nodo actual = primero;
        while ( actual != null ) {
            System.out.print( actual.getDato() +"," );
            actual = actual.getEnlace();
        }
        System.out.println();
    }

    public Nodo getPrimero() {
        return primero;
    }
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}
