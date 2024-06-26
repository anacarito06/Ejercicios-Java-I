import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("La cadena ingresada es un palíndromo.");
        } else {
            System.out.println("La cadena ingresada no es un palíndromo.");
        }
        scanner.close();
    }
    public static boolean esPalindromo(String texto) {
        // Eliminar espacios, puntuación y convertir a minúsculas
        String textoFiltrado = texto.replaceAll("[\\W]", "").toLowerCase();

        // Invertir la cadena filtrada
        String textoInvertido = new StringBuilder(textoFiltrado).reverse().toString();

        // Comparar la cadena filtrada con su versión invertida
        return textoFiltrado.equals(textoInvertido);
    }
}
