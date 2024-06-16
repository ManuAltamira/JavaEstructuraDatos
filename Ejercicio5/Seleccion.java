package Ejercicio5;

public class Seleccion {
    public static void intercambiar(double []a, int i, int j) {
        double aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }
    public static void ordSeleccion (double a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n-1; i++) {
            indiceMenor = i;
            for (j = i+1; j < n; j++)
                if (a[j] < a[indiceMenor])
                    indiceMenor = j;
            if (i != indiceMenor)
                intercambiar(a, i, indiceMenor);
        }
    }

    public static void main(String[] args) {
        double[] arreglo = { 40,21,4,9,10,35 };
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
        
        Seleccion.ordSeleccion(arreglo);
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
    }
}
