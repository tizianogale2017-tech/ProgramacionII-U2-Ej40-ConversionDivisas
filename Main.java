package Ejercicio40_conversionDivisas;

public class Main {
    public static void main(String[] args) {
        ProveedorTasaCambio[] fuentes = {new TasaBancoCentral(), new TasaMercadoLibre()};
        String[] nombres = {"Banco Central", "Mercado"};

        for (int i = 0; i < fuentes.length; i++) {
            ConversorMoneda conversor = new ConversorMoneda(fuentes[i]);
            System.out.printf("%-14s | 200 USD = %.2f ARS | 50 EUR = %.2f ARS%n", nombres[i],
                    conversor.convertir(200, "USD", "ARS"), conversor.convertir(50, "EUR", "ARS"));
        }

        try {
            new ConversorMoneda(fuentes[0]).convertir(10, "USD", "JPY");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
