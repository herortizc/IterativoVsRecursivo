public class Factorial {

    // Factorial Iterativo
    public static long factorialIterativo(int n) {

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    // Factorial Recursivo
    public static long factorialRecursivo(int n) {

        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        }

        // Llamada recursiva
        return n * factorialRecursivo(n - 1);
    }

    // Método main para probar
    public static void main(String[] args) {

        int numero = 5;

        System.out.println("Factorial Iterativo de " + numero + " = "
                + factorialIterativo(numero));

        System.out.println("Factorial Recursivo de " + numero + " = "
                + factorialRecursivo(numero));
    }
}