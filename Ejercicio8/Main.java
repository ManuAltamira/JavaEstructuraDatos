package Ejercicio8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        PilaLineal pilaChar;
        boolean esPal;
        String pal;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            pilaChar = new PilaLineal(); // crea pila vacía
            System.out.print("Teclea la palabra" + " a verificar si es palíndromo: ");
            pal = entrada.readLine();
            // se crea la pila con los caracteres de la palabra
            for (int i = 0; i < pal.length();) {
                Character c;
                // c = new Character(pal.charAt(i++));
                c = Character.valueOf(pal.charAt(i++));
                pilaChar.insertar(c);
            }
            // se comprueba si es palíndromo
            esPal = true;
            for (int j = 0; esPal && !pilaChar.pilaVacia();) {
                Character c;
                c = (Character) pilaChar.quitar();
                esPal = pal.charAt(j++) == c.charValue();
            }
            pilaChar.limpiarPila();
            if (esPal)
                System.out.println("La palabra " + pal + " es un palíndromo \n");
            else
                System.out.println("La palabra " + pal + " no es un palíndromo \n");
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}
