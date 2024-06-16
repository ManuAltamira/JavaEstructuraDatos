package Ejercicio10;
import java.util.Scanner;

public class Main {
        public static void main(String[ ] args) throws Exception{
        Scanner sc = new Scanner (System. in) ;

        PilaLineal pila = new PilaLineal();
        ColaLineal cola = new ColaLineal();

        System.out.println(",Cuantos elementos tendra la pila?");
        int elementos = sc.nextInt();

        System. out. println("Ingrese los numeros enteros positivos a continuacion: ");
        for (int i=0; i<elementos; i++)
        pila. insertar( Integer.valueOf( sc.nextInt() ) );

        while ( !pila.pilaVacia() ){
        int x = ((Integer)pila.quitar()).intValue();
        if ( x % 2 == 0 )
        cola.insertar( Integer.valueOf( x ) );
        }
        System.out.println("Se muestran los numeros en la cola:" );
        while ( !cola.colaVacia() )
        System.out.println( cola.quitar() );
        sc.close();
    }
}
