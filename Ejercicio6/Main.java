package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarCabeza( new Elemento(3) );
        lista.insertarCabeza( new Elemento(8) );
        lista.insertarCabeza( new Elemento(1) );
        lista.insertarCabeza( new Elemento(6) );
        lista.insertarCabeza( new Elemento(4) );

        lista.visualizar();
        System.out.println();

        lista.insertarUltimo( new Elemento(2) );
        lista.insertarUltimo( new Elemento(7) );
        lista.insertarUltimo( new Elemento(9) );

        lista.visualizar();
        System.out.println();
        
        /*
        Nodo actual = lista.getPrimero();
        while (actual != null) {
            if (actual.getDato().getNumero()==2)
                break;
            actual = actual.getEnlace();
        }

        lista.insertar(actual, new Elemento(5) );
        lista.insertar(actual, new Elemento(0) );

        lista.visualizar();
        System.out.println();
        */

        lista.insertar(new Elemento(2), new Elemento(5) );
        lista.insertar(new Elemento(2), new Elemento(0) );

        lista.visualizar();
        System.out.println();
    }
}
