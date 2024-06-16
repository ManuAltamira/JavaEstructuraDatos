package Ejercicio5;

public class Insercion {
    public static void ordInsercion (int [] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            j = i;
            aux = a[i];
            while (j > 0 && aux < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo = { 9,1,8,2,7,3,6,4,5 };
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
        
        Insercion.ordInsercion(arreglo);
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
    }
}
