package Ejercicio7;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numelementos;
        int limite;
        Lista lista = new Lista();
        Nodo nodo, nodo_tmp;

        do {
            System.out.println("Ingrese el número de elementos a generar: ");
            numelementos = Integer.parseInt( sc.next() );

            if (numelementos <= 0)
                System.out.println("El valor es incorrecto, favor de ingresar un número entero positivo.");
        }
        while (numelementos <= 0);

        do {
            System.out.println("Ingrese el número máximo para los elementos permanecer: ");
            limite = Integer.parseInt( sc.next() );

            if (limite <= 0)
                System.out.println("El valor es incorrecto, favor de ingresar un número entero positivo.");
        }
        while (limite <= 0);
        
        sc.close();
        
        //567,850,96,595,119,142,342,485,498,648,
        Random rand = new Random();
        for (int i=0; i<numelementos; i++) {
            //int x = i;
            int x = rand.nextInt(1000-0+1)+0;
            lista.insertarUltimo(x);
        }
        lista.visualizar();

        int tmp = numelementos;
        for (int i=0; i<=tmp;) {
            nodo = lista.buscarPosicion(i);
            if (nodo.getDato() > limite) {
                nodo_tmp = nodo.getEnlace();
                lista.eliminar(nodo.getDato());
                if (tmp > i)
                    tmp--;
                if (nodo_tmp.getDato() < limite && tmp > i)
                    i++;
            }
            else
                i++;
        }
        lista.visualizar();
    }
}
