package Ejercicio2;

import java.io.*;

class SumaMax {
    public static void main(String [] a)throws Exception {
        final int NUM = 21;

        int items[] = new int[NUM];
        int n;

        n = entrada(items); // devuelve el número real de elementos

        System.out.println("\nSuma de los elementos: " + sumaEnteros(items,n));
        System.out.println("\nValor máximo: " + maximo(items,n));
    }

    static int entrada(int w[])throws Exception {
        int k = 0, x;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca un máximo de " + w.length + "datos, terminar con -1");
        do {
            x = Integer.parseInt(entrada.readLine());
            if (x != -1 )
                w[k++] = x;
         }
        while ((k < w.length) && (x != -1));
        return k;
   }
   
   static int sumaEnteros(int w [], int n)
   {
    int i, total = 0;
    for (i = 0; i < n; i++)
    total += w[i];
    return total;
   } 
   static int maximo(int w[], int n)
   {
    int mx, i;
    mx = w[0]; 
    for (i = 1; i < n; i++)
    mx = (w[i]>mx ? w[i]: mx);
    return mx;
   }
   }

