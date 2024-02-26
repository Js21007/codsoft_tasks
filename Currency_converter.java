import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Currency_converter {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {

        exchangeRates.put("INR", 73.50);
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("GBP", 0.73);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.50);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Availabel Currencies for conversion : INR, USD, GBP, EUR, JPY");
        System.out.println("Enter currency type to be converted :");
        String currency = scanner.nextLine().toUpperCase();

        System.out.println("Enter target currency type you want to convert into :");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the amount you want to convert :");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(amount, currency, targetCurrency);

        System.out.printf("%.2f %s is equal to %.2f %s%n",
                amount, currency, convertedAmount, targetCurrency);

        scanner.close();
    }

    private static double convertCurrency(double amount, String Currency, String targetCurrency) {
        if (!exchangeRates.containsKey(Currency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency selection");
            System.exit(1);

        }

        double Rate = exchangeRates.get(Currency);
        double targetRate = exchangeRates.get(targetCurrency);

        return amount * (targetRate / Rate);
    }
}
