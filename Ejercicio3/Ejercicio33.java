package Ejercicio3;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        Original
        4 7 1 3 5
        2 0 6 9 7
        3 1 2 6 4
        
        Pivote
        4 2 3
        7 0 1
        1 6 2
        3 9 6
        5 7 4
         */
        int[][] matriz = {
            {4,7,1,3,5},
            {2,0,6,9,7},
            {3,1,2,6,4}
        };
        int fila = matriz.length;
        int columna = matriz[0].length;
        int[][] pivote = new int[ columna ][ fila ];

        for (int i=0; i<fila; i++)
            for (int j=0; j<columna; j++)
                pivote[j][i] = matriz[i][j];

        System.out.println(">Matriz Original<");
        for (int i=0; i<fila; i++) {
            for (int j=0; j<columna; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }

        System.out.println(">Matriz Pivote<");
        for (int i=0; i<pivote.length; i++) {
            for (int j=0; j<pivote[i].length; j++)
                System.out.print(pivote[i][j] + " ");
            System.out.println();
        }
    }
}

