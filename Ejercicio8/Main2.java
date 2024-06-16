package Ejercicio8;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        PilaLineal pilaChar;
        ColaLineal colaChar;
        boolean esPal;
        String pal;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            pilaChar = new PilaLineal();
            colaChar = new ColaLineal();

            System.out.print("Teclea la palabra" + " a verificar si es palíndromo: ");
            pal = entrada.readLine();

            for (int i = 0; i < pal.length();) {
                Character c;
                c = Character.valueOf(pal.charAt(i++));
                pilaChar.insertar(c);
                colaChar.insertar(c);
            }

            esPal = true;
            while (esPal && !pilaChar.pilaVacia() && !colaChar.colaVacia()) {
                esPal = pilaChar.quitar() == colaChar.quitar();
                // esPal = ((Character)pilaChar.quitar()).charValue() ==
                // ((Character)colaChar.quitar()).charValue();
            }

            pilaChar.limpiarPila();
            colaChar.colaVacia();

            if (esPal)
                System.out.println("La palabra " + pal + " es un palíndromo \n");
            else
                System.out.println("La palabra " + pal + " no es un palíndromo \n");
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}
