import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mapa de taxas de câmbio fixas
        Map<String, Double> taxasCambio = new HashMap<>();
        taxasCambio.put("USD", 0.18);  // 1 BRL = 0.18 USD
        taxasCambio.put("EUR", 0.15);  // 1 BRL = 0.15 EUR
        taxasCambio.put("GBP", 0.13);  // 1 BRL = 0.13 GBP

        System.out.print("Digite o valor em Real (BRL): ");
        double valorReal = scanner.nextDouble();

        System.out.print("Digite a moeda de destino (USD, EUR, GBP): ");
        String moedaDestino = scanner.next().toUpperCase();

        // Verifica se a moeda de destino é válida
        if (!taxasCambio.containsKey(moedaDestino)) {
            System.out.println("Moeda de destino inválida.");
            scanner.close();
            return;
        }

        // Obtém a taxa de câmbio da moeda de destino
        double taxaCambio = taxasCambio.get(moedaDestino);

        // Conversão do valor para a moeda de destino
        double valorDestino = valorReal * taxaCambio;

        System.out.println("O valor em " + moedaDestino + " é: " + valorDestino);

        scanner.close();
    }
}
