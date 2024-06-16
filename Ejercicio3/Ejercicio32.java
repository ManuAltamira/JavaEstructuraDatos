package Ejercicio3;

import java.io.*;
public class Ejercicio32 {

public static void main(String[] args) throws Exception {
    int i,j,k;
    // int Primero[] = new int[21];
    int Segundo[] = new int[21];
    // int Tercero[][] = new int[7][8];
    BufferedReader entrada = new BufferedReader( (new InputStreamReader(System.in)));

    System.out.println(">Capturas");
    k = Integer.parseInt(entrada.readLine());
    for (i=3; i <=k;)
    Segundo[i++] = Integer.parseInt(entrada.readLine());

    System.out.println(">Impresion");
    j = 4;
    System.out.print( + Segundo [k] + " " + Segundo[j+1]);
 }
}
