public class BusquedaLineal {

    // Búsqueda Lineal Iterativa
    public static int busquedaIterativa(int[] arreglo, int valor) {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }

        return -1; // No encontrado
    }

    // Búsqueda Lineal Recursiva
    public static int busquedaRecursiva(int[] arreglo, int valor, int indice) {

        // Caso base: llegó al final
        if (indice >= arreglo.length) {
            return -1;
        }

        if (arreglo[indice] == valor) {
            return indice;
        }

        return busquedaRecursiva(arreglo, valor, indice + 1);
    }

    // Método main para probar
    public static void main(String[] args) {

        int[] datos = {3, 7, 10, 25, 40};
        int valor = 25;

        int resultadoIter = busquedaIterativa(datos, valor);
        int resultadoRec = busquedaRecursiva(datos, valor, 0);

        System.out.println("Iterativa encontró en índice: " + resultadoIter);
        System.out.println("Recursiva encontró en índice: " + resultadoRec);
    }
}