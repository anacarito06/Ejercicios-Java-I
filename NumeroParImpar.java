import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " es par");
                } else {
                    System.out.println(i + " es impar");
                }
            }
        } else {
            System.out.println("El número ingresado no es un entero positivo.");
        }

        scanner.close();
    }
}