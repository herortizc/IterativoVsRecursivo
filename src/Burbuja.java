public class Burbuja {

    // Burbuja Iterativo
    public static void burbujaIterativo(int[] arreglo) {

        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Burbuja Recursivo
    public static void burbujaRecursivo(int[] arreglo, int n) {

        // Caso base
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {

            if (arreglo[i] > arreglo[i + 1]) {

                int temp = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = temp;
            }
        }

        burbujaRecursivo(arreglo, n - 1);
    }

    // Método para imprimir arreglo
    public static void imprimir(int[] arreglo) {

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método main para probar
    public static void main(String[] args) {

        int[] datos1 = {5, 2, 9, 1, 3};
        int[] datos2 = {5, 2, 9, 1, 3};

        burbujaIterativo(datos1);
        burbujaRecursivo(datos2, datos2.length);

        System.out.print("Iterativo ordenado: ");
        imprimir(datos1);

        System.out.print("Recursivo ordenado: ");
        imprimir(datos2);
    }
}