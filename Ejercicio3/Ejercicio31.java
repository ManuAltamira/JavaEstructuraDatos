package Ejercicio3;

import java.io.*;
public class Ejercicio31 {

public static void main(String[] args) throws Exception {
    int i;
    int Primero[] = new int[21];
    // int Segundo[] = new int[21];
    // int Tercero[][] = new int[7][8];
    BufferedReader entrada = new BufferedReader( (new InputStreamReader(System.in)));

    System.out.println(">Capturas");
    for (i=1; i <= 6; i++)
    Primero[i] = Integer.parseInt(entrada.readLine());

    System.out.println(">Impresion");
    for (i=3; i>0; i--)
    System.out.print(Primero[2*i] + " ");
  }
}
