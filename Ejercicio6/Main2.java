package Ejercicio6;

public class Main2 {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarOrdenada( new Elemento(3) );
        lista.insertarOrdenada( new Elemento(8) );
        lista.insertarOrdenada( new Elemento(1) );
        lista.insertarOrdenada( new Elemento(6) );
        lista.insertarOrdenada( new Elemento(4) );
        lista.insertarOrdenada( new Elemento(2) );
        lista.insertarOrdenada( new Elemento(7) );
        lista.insertarOrdenada( new Elemento(9) );
        lista.insertarOrdenada( new Elemento(5) );
        lista.insertarOrdenada( new Elemento(0) );

        lista.visualizar();
        System.out.println();

        Nodo encontrado = lista.buscar( new Elemento(4) );
        System.out.println( encontrado.getDato().getNumero() );
        encontrado = lista.buscar( new Elemento(10) );
        if (encontrado == null) System.out.println( "No existe." );

        lista.eliminar( new Elemento(7) );
        lista.visualizar();
    }
}
