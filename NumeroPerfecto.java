import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        int sumaDivisores = calcularSumaDivisores(numero);

        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto");
        } else {
            System.out.println(numero + " no es un número perfecto");
        }
    }

    public static int calcularSumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}

// Este codigo utiliza en la 1 parte solo FOR y en la 2 parte si utiliza el if else, cosa que en las opciones de la pregunta 5 no hay.6
