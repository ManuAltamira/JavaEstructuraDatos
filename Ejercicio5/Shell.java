package Ejercicio5;

public class Shell {
    public static void intercambiar(double []a, int i, int j) {
        double aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }

    public static void ordenacionShell(double a[]) {
        int intervalo, i, j, k;
        int n= a.length;

        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k])
                        j = -1; // par de elementos ordenado
                    else {
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    public static void main(String[] args) {
        double[] arreglo = { 9,1,8,2,7,3,6,4,5 };
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
        
        Shell.ordenacionShell(arreglo);
        
        for (int i=0; i<arreglo.length; i++)
            System.out.print(arreglo[i] + ", ");
        System.out.println();
    }
}
