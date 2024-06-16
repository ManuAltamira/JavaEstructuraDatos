
package Ejercicio6;

public class Lista {
    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabeza(Elemento dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.setEnlace(primero);
        primero = nuevo;

        return this;
    }

    public Lista insertarUltimo(Elemento dato) {
        Nodo nuevo = new Nodo(dato);
        
        Nodo actual = primero;
        while (actual.getEnlace() != null)
            actual = actual.getEnlace();
        actual.setEnlace(nuevo);

        return this;
    }

    public Lista insertar(Nodo anterior, Elemento dato) {
        Nodo nuevo = new Nodo(dato);
        
        nuevo.setEnlace( anterior.getEnlace() );
        anterior.setEnlace(nuevo);
        
        return this;
    }
    public Lista insertar(Elemento anterior, Elemento dato) {
        Nodo nuevo = new Nodo(dato);

        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato().getNumero() == anterior.getNumero())
                break;
            actual = actual.getEnlace();
        }
        
        nuevo.setEnlace( actual.getEnlace() );
        actual.setEnlace(nuevo);
        
        return this;
    }

    public Lista insertarOrdenada(Elemento dato) {
        Nodo nuevo = new Nodo(dato);

        Nodo actual = primero;
        Nodo anterior = primero;
        while (actual != null) {
            if (actual.getDato().getNumero() > nuevo.getDato().getNumero())
                break;
            anterior = actual;
            actual = actual.getEnlace();
            if (actual == null)
                break;
        }

        if (anterior == null || (anterior.getDato().getNumero() > nuevo.getDato().getNumero())) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        else {
            nuevo.setEnlace( anterior.getEnlace() );
            anterior.setEnlace(nuevo);
        }
        
        return this;
    }

    public Nodo buscar(Elemento destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.getEnlace())
            if (destino.getNumero() == indice.getDato().getNumero())
            // ( destino.equals( indice.getDato() ) )
                return indice;
        return null;
    }

    public void eliminar(Elemento entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        
        actual = primero;
        anterior = null;
        encontrado = false;
        
        while ( actual != null && !encontrado ) {
            encontrado = ( actual.getDato().getNumero() == entrada.getNumero() );
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
            System.out.print( actual.getDato().getNumero() +"," );
            actual = actual.getEnlace();
        }
    }

    public Nodo getPrimero() {
        return primero;
    }
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}
