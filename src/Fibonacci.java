public class Fibonacci {

    // Fibonacci Iterativo
    public static long fibonacciIterativo(int n) {

        if (n <= 1) {
            return n;
        }

        long a = 0;
        long b = 1;
        long resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }

        return resultado;
    }

    // Fibonacci Recursivo (sin memoización)
    public static long fibonacciRecursivo(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Método main para probar
    public static void main(String[] args) {

        int numero = 10;

        System.out.println("Fibonacci Iterativo de " + numero + " = "
                + fibonacciIterativo(numero));

        System.out.println("Fibonacci Recursivo de " + numero + " = "
                + fibonacciRecursivo(numero));
    }
}