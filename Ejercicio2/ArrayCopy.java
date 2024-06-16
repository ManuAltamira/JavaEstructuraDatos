package Ejercicio2;

public class ArrayCopy {

       public static void main(String[] args) {
              final int N = 15;
              final int M = 20;
              double[] v = new double[N], w = new double[M];
              double x = 1.0;

              for (int i = 0; i < N; x += 0.2, i++)
                     v[i] = Math.exp(2 * x - 1);
              for (int i = 0; i < M; i++)
                     w[i] = (double) i;
              // Se imprimen los elementos del vector v
              System.out.println("\n Valores del vector v");
              for (int i = 0; i < N; i++)
                     System.out.print(v[i] + " ");
              System.out.flush();
              // Es realizada la copia de v a w
              System.arraycopy(v, (N - 1) - 10 + 1, w, 10, 10);
              // Se impimen los elementos del vector w
              System.out.println("\n Valores del vector w");
              for (int i = 0; i < M; i++)
                     System.out.print(w[i] + " ");
              System.out.flush();
       }
}
