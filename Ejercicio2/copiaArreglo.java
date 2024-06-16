package Ejercicio2;

public class copiaArreglo {

    public static void name(String[] args) {
        /*
         * copia directa
         */
        double[] r, w;
        r = new double[11];
        w = new double[15];
        for (int j = 0; j < r.length; j++)
            r[j] = (double) 2 * j - 1;

        // asignación del array r a w
        w = r;
        System.out.println("Tamaño r=" + r.length);
        System.out.println("Tamaño w=" + w.length);
        // w(11) = 3: //error

        /*
         * copia indirecta
         */
        int v1[] = new int[11];
        int v2[] = new int[15];

        for (int i = 0; i < v1.length; i++)
            v1[i] = (int) Math.random() * 199 + 1;

        // Los elemntos de v1 son copiados a v2

        for (int i = 0; i < v1.length; i++)
            v2[i] = v1[i];
        System.out.println("Tamaño v1=" + v1.length);
        System.out.println("Tamaño v2=" + v2.length);
    }
}
