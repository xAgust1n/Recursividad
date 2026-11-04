
package recursividad;


import java.util.Arrays;

public class Recursividad {

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return mcd(b, a % b);
    }

    public static int count(Object datos[], int n, Object o) {
        if (n == 0) {
            return 0;
        }

        int contador = 0;

        if (java.util.Objects.equals(datos[n - 1], o)) {
            contador = 1;
        }

        return contador + count(datos, n - 1, o);
    }
    
    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        Object temporal = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temporal;

        reverse(datos, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci de 5: " + fibonacci(5));
        System.out.println("Fibonacci de 40: " + fibonacci(40));
        System.out.println("MCD de 45 y 75: " + mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + mcd(47, 91));

        Object numeros[] = {1, 2, 3, 3, 2, 3, 1};

        System.out.println("Ocurrencias de 3: "
                + count(numeros, numeros.length, 3));

        System.out.println("Ocurrencias de 1: "
                + count(numeros, numeros.length, 1));

        Object letras[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};

        System.out.println("Ocurrencias de C: "
                + count(letras, letras.length, 'C'));

        System.out.println("Ocurrencias de E: "
                + count(letras, letras.length, 'E'));
        
        Object arreglo1[] = {1, 2, 3, 4, 5};
        reverse(arreglo1, 0, arreglo1.length - 1);

        System.out.println("Arreglo invertido: "
                + Arrays.toString(arreglo1));

        Object arreglo2[] = {'A', 'B', 'C', 'D'};
        reverse(arreglo2, 0, arreglo2.length - 1);

        System.out.println("Arreglo invertido: "
                + Arrays.toString(arreglo2));
    }
}