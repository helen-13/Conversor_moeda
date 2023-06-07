import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Real (BRL): ");
        double valorReal = scanner.nextDouble();

        // Taxa de câmbio fixa entre BRL e USD
        double taxaCambio = 0.18;  // 1 BRL = 0.18 USD

        // Conversão do valor para Dólar
        double valorDolar = valorReal * taxaCambio;

        System.out.println("O valor em Dólar (USD) é: " + valorDolar);

        scanner.close();
    }
}
