package Ejercicio5;

public class Intercambio {
    public static void intercambiar(int []a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }
    public static void ordIntercambio (int a[]) {
        int i, j;
        for (i = 0 ; i < a.length-1; i++)
            for (j = i+1 ; j < a.length; j++)
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
    }
    public static void main(String[] args) {
        int[] arreglo = { 9,1,8,2,7,3,6,4,5 };
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
        
        Intercambio.ordIntercambio(arreglo);
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
    }
}
