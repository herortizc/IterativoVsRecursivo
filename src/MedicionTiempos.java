public class MedicionTiempos {

    // ================= FACTORIAL =================

    public static long medirFactorialIterativo(int n) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            Factorial.factorialIterativo(n);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    public static long medirFactorialRecursivo(int n) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            Factorial.factorialRecursivo(n);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    // ================= FIBONACCI =================

    public static long medirFibonacciIterativo(int n) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            Fibonacci.fibonacciIterativo(n);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    public static long medirFibonacciRecursivo(int n) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            Fibonacci.fibonacciRecursivo(n);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    // ================= BUSQUEDA =================

    public static long medirBusquedaIterativa(int[] arreglo, int valor) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            BusquedaLineal.busquedaIterativa(arreglo, valor);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    public static long medirBusquedaRecursiva(int[] arreglo, int valor) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            BusquedaLineal.busquedaRecursiva(arreglo, valor, 0);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    // ================= BURBUJA =================

    public static long medirBurbujaIterativa(int[] arreglo) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            int[] copia = arreglo.clone(); // importante
            long inicio = System.nanoTime();
            Burbuja.burbujaIterativo(copia);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    public static long medirBurbujaRecursiva(int[] arreglo) {
        long total = 0;
        for (int i = 0; i < 5; i++) {
            int[] copia = arreglo.clone();
            long inicio = System.nanoTime();
            Burbuja.burbujaRecursivo(copia, copia.length);
            long fin = System.nanoTime();
            total += (fin - inicio);
        }
        return total / 5;
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        // -------- FACTORIAL --------
        System.out.println("FACTORIAL");
        int[] pruebasFact = {5, 10, 15, 20};

        for (int n : pruebasFact) {
            long iter = medirFactorialIterativo(n);
            long rec = medirFactorialRecursivo(n);
            System.out.println("n = " + n + " | Iterativo: " + iter + " ns | Recursivo: " + rec + " ns");
        }

        // -------- FIBONACCI --------
        System.out.println("\nFIBONACCI");
        int[] pruebasFib = {10, 20, 30, 35};

        for (int n : pruebasFib) {
            long iter = medirFibonacciIterativo(n);
            long rec = medirFibonacciRecursivo(n);
            System.out.println("n = " + n + " | Iterativo: " + iter + " ns | Recursivo: " + rec + " ns");
        }

        // -------- BUSQUEDA --------
        System.out.println("\nBUSQUEDA LINEAL");

        int[] tamañosBusqueda = {500, 1000, 2000, 3000};

        for (int tamaño : tamañosBusqueda) {

            int[] arreglo = new int[tamaño];

            // Inicialización (NO se mide)
            for (int i = 0; i < tamaño; i++) {
                arreglo[i] = i;
            }

            int valorBuscar = tamaño - 1;

            long iter = medirBusquedaIterativa(arreglo, valorBuscar);
            long rec = medirBusquedaRecursiva(arreglo, valorBuscar);

            System.out.println("n = " + tamaño +
                    " | Iterativo: " + iter +
                    " ns | Recursivo: " + rec + " ns");
        }

        // -------- BURBUJA --------
        System.out.println("\nBURBUJA");

        int[] tamañosBurbuja = {1000, 2000, 3000, 4000};

        for (int tamaño : tamañosBurbuja) {

            int[] arreglo = new int[tamaño];

            // Peor caso (orden inverso)
            for (int i = 0; i < tamaño; i++) {
                arreglo[i] = tamaño - i;
            }

            long iter = medirBurbujaIterativa(arreglo);
            long rec = medirBurbujaRecursiva(arreglo);

            System.out.println("n = " + tamaño +
                    " | Iterativo: " + iter +
                    " ns | Recursivo: " + rec + " ns");
        }
    }
}